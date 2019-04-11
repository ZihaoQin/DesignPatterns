package SingletonPattern;

/**
 * @ClassName:SingletonPattern.java
 * @Description:TODO （懒汉式）
 * @Author:qzh
 * @Date: 2019/3/26 14:30
 * @Version 1.0
 */
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public SingletonPattern getInstance(){
        if (this.singletonPattern == null){
            this.singletonPattern = new SingletonPattern();
        }
        return this.singletonPattern;
    }
}
