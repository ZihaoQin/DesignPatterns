package VisitorPattern;

/**
 * @ClassName:Employee.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/4 14:31
 * @Version 1.0
 */
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    //姓名
    private String name;
    //工资
    private int salary;
    //性别
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //允许一个访问者过来访问
    public abstract void accept(IVisitor visitor);

}
