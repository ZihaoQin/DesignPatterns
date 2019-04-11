package templateMethodPattern;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 13:52
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarmFlag(true);
        hummerH1Model.run();
        HummerModel hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }
}
