package templateMethodPattern;

/**
 * @ClassName:HummerH2Model.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 13:44
 * @Version 1.0
 */
public class HummerH2Model extends HummerModel {

    //public 可改为 protected
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
