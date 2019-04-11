package VisitorPattern;

/**
 * @ClassName:Visitor.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/4 15:17
 * @Version 1.0
 */
public class Visitor implements IVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    //普通员工工资系数总和
    private int commonTotalSalary = 0;

    //部门经理工资总和
    private int managerTotalSalary = 0;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        this.calCommonSalary(commonEmployee.getSalary());
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        this.calManagerSalary(manager.getSalary());
    }

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }


    //获得所有员工的工资总和
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男")
                + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
