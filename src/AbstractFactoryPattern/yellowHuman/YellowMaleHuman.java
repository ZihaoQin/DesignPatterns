package AbstractFactoryPattern.yellowHuman;

/**
 * @ClassName:YellowMaleHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 19:08
 * @Version 1.0
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男....");
    }
}
