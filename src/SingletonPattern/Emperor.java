package SingletonPattern;

/**
 * @ClassName:Emperor.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 13:36
 * @Version 1.0
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某。。。");
    }
}
