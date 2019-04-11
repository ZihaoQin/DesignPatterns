package StatePattern;

/**
 * @ClassName:Context.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:07
 * @Version 1.0
 */
public class Context {
    //定义出所有电梯的状态
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
