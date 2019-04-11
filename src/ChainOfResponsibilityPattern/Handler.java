package ChainOfResponsibilityPattern;


/**
 * @ClassName:Hander.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/3 16:20
 * @Version 1.0
 */
public abstract class Handler {
    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        }else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            }else {
                System.out.println("-----------没地方请示了，不做处理！---------\n");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void response(IWomen women);
}
