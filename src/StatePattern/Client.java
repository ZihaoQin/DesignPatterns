package StatePattern;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 15:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
