package AbstractFactoryPattern.blackHuman;

/**
 * @ClassName:BlackMaleHuman.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 19:10
 * @Version 1.0
 */
public class BlackMaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }
}
