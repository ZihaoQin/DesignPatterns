package VisitorPattern;

/**
 * @InterfaceName:IVisitor
 * @Description:TODO（）
 * @Author:qzh
 * @Date: 2019/4/4 15:15
 * @Version 1.0
 */
public interface IVisitor {
    //定义可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    //定义可以访问部门经理
    public void visit(Manager manager);


}
