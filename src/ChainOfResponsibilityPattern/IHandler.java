package ChainOfResponsibilityPattern;

/**
 * @InterfaceName:IHander
 * @Description:TODO（）
 * @Author:qzh
 * @Date: 2019/4/3 16:03
 * @Version 1.0
 */
public interface IHandler {
    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
