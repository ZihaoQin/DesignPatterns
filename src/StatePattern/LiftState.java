package StatePattern;

/**
 * @ClassName:LiftState.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 19:07
 * @Version 1.0
 */
public abstract class LiftState {

    //定义一个环境角色，也就是封装状态的变换引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
