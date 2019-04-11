package StatePattern;

/**
 * @ClassName:ClosingState.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:21
 * @Version 1.0
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }


    //关闭状态要实现的动作
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //设置为停止状态；
        super.context.getLiftState().stop();
    }
}
