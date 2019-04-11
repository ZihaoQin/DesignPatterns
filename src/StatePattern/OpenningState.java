package StatePattern;

/**
 * @ClassName:OpenningState.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:12
 * @Version 1.0
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        //修改状态
        super.context.setLiftState(Context.closeingState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
