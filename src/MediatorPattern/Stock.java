package MediatorPattern;

import org.omg.CORBA.COMM_FAILURE;

/**
 * @ClassName:Stock.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 14:47
 * @Version 1.0
 */
public class Stock extends AbstractColleague {
    //刚开始有100台电脑
    private static int COMPITER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    //库存增加
    public void increase(int number){
        COMPITER_NUMBER = COMPITER_NUMBER + number;
        System.out.println("库存数量为：" + COMPITER_NUMBER);
    }

    //库存降低
    public void decrease(int number) {
        COMPITER_NUMBER = COMPITER_NUMBER - number;
        System.out.println("库存数量为：" + COMPITER_NUMBER);
    }

    //获取库存数量
    public int getStockNumber(){
        return COMPITER_NUMBER;
    }

    //存货压力大，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){

        System.out.println("清理存货数量为：" + COMPITER_NUMBER);
        super.mediator.execute("stock.clear");
    }

}
