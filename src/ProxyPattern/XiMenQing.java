package ProxyPattern;

/**
 * @ClassName:XiMenQing.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 13:25
 * @Version 1.0
 */
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
