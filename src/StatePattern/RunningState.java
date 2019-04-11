package StatePattern;

/**
 * @ClassName:RunningState.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:22
 * @Version 1.0
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行了...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //环境设置为停止状态；
        super.context.getLiftState().stop();
    }
}
