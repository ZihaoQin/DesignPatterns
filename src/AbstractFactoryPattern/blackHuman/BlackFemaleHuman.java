package AbstractFactoryPattern.blackHuman;

/**
 * @ClassName:AbstractBlackHumanImpl.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 19:00
 * @Version 1.0
 */
public class BlackFemaleHuman extends AbstractBlackHuman {

    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
