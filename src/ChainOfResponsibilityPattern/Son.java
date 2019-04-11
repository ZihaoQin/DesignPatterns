package ChainOfResponsibilityPattern;

/**
 * @ClassName:Son.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 16:06
 * @Version 1.0
 */
public class Son extends Handler {



    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
