package templateMethodPattern;

/**
 * @ClassName:HummerH1Model.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 13:32
 * @Version 1.0
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;//是否要响喇叭
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
