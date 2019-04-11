package VisitorPattern;

/**
 * @ClassName:TotalVisitor.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/4 19:00
 * @Version 1.0
 */
public class TotalVisitor implements ITotalVisitor {

    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    //普通员工工资系数总和
    private int commonTotalSalary = 0;

    //部门经理工资总和
    private int managerTotalSalary = 0;
    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是：" + (commonTotalSalary + managerTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.calCommonSalary(commonEmployee.getSalary());
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        this.calManagerSalary(manager.getSalary());
    }

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }
}
