package MediatorPattern;

/**
 * @ClassName:Purchase.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 14:40
 * @Version 1.0
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不采购IBM电脑");
    }
}
