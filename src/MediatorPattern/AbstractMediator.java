package MediatorPattern;

import java.util.Observer;

/**
 * @ClassName:AbstractMediator.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 16:16
 * @Version 1.0
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    //中介者最重要的方法，叫作事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
