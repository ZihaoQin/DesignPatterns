package FactoryMethodPattern.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @ClassName:ClassUtils.java
 * @Description:TODO （获取某一接口的所有实现类的工具类）
 * @Author:qzh
 * @Date: 2019/3/26 21:48
 * @Version 1.0
 */
@SuppressWarnings("all")
public class ClassUtils {
    public static List<Class> getAllClassByInterface(Class c) {
        List<Class> returnClassList = new ArrayList<Class>();
        if (c.isInterface()){
            String packageName = c.getPackage().getName();
            try {
                List<Class> allClass =  getClasses(packageName);
                //判断是否是同一个接口
                for(int i=0;i<allClass.size();i++){
                    if(c.isAssignableFrom(allClass.get(i))){ //判断是不是一个接口
                        if(!c.equals(allClass.get(i))){ //本身不加进去
                            returnClassList.add(allClass.get(i));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }

    private static List<Class> getClasses(String packageName) throws ClassNotFoundException,IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File dircetory : dirs){
            classes.addAll(findClasses(dircetory,packageName));
        }
        return classes;

    }

    private static List<Class> findClasses(File dircetory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!dircetory.exists()){
            return classes;
        }
        File[] files = dircetory.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file,packageName + "." + file.getName()));
            }else if (file.getName().endsWith(".class")){
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0,file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
