package SingletonPattern;

/**
 * @ClassName:DoubleCheckLock.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/5/5 11:53
 * @Version 1.0
 */
public class DoubleCheckLock {
    private static DoubleCheckLock doubleCheckLock = null;
    private DoubleCheckLock(){

    }
    public static DoubleCheckLock getInstance(){
        if (doubleCheckLock == null) {
            synchronized (DoubleCheckLock.class) {
                if (doubleCheckLock == null) {
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }
        return doubleCheckLock;
    }

}
