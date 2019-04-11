package BridgePattern.corp;

import BridgePattern.prod.Product;

/**
 * @ClassName:Corp.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/29 13:10
 * @Version 1.0
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMonkey(){
        this.product.beProducted();
        this.product.beSelled();
    }
}
