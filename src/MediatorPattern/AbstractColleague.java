package MediatorPattern;

/**
 * @ClassName:AbstractColleague.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 16:37
 * @Version 1.0
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
