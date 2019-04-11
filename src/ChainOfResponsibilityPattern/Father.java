package ChainOfResponsibilityPattern;

/**
 * @ClassName:Father.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 16:05
 * @Version 1.0
 */
public class Father extends Handler {

    public Father() {
        super(1);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
