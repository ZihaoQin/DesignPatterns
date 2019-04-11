package AbstractFactoryPattern.yellowHuman;

/**
 * @ClassName:YellowFemaleHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 19:06
 * @Version 1.0
 */
public class YellowFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
