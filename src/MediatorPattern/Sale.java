package MediatorPattern;

import java.util.Random;

/**
 * @ClassName:Sale.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 14:56
 * @Version 1.0
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM型号的电脑
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况，0-100之间变化，0代表根本就没人买，100代表非常畅销
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为：" + saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
