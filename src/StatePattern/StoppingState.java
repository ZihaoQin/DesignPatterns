package StatePattern;

/**
 * @ClassName:StoppingState.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:22
 * @Version 1.0
 */
public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
