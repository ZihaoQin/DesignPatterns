package SingletonPattern;

/**
 * @ClassName:SingletonPattern2.java
 * @Description:TODO （饿汉式）
 * @Author:qzh
 * @Date: 2019/3/26 14:34
 * @Version 1.0
 */
public class SingletonPattern2 {
    private static SingletonPattern2 singletonPattern2 = new SingletonPattern2();
    private SingletonPattern2(){}
    public synchronized static SingletonPattern2 getInstance() {
        return singletonPattern2;
    }
}
