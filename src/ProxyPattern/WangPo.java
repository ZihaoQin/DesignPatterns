package ProxyPattern;

/**
 * @ClassName:WangPo.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 13:18
 * @Version 1.0
 */
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    public WangPo() {   //创建王婆时，默认是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    //自定义代理
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
