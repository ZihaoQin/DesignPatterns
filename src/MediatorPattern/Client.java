package MediatorPattern;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/7 15:10
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        //销售人员销售电脑
        System.out.println("----------销售人员销售电脑------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        //库房管理人员管理库存
        System.out.println("------库房管理人员管理库存----");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
