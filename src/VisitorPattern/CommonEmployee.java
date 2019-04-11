package VisitorPattern;

/**
 * @ClassName:CommonEmployee.java
 * @Description:TODO （普通员工）
 * @Author:qzh
 * @Date: 2019/4/4 14:38
 * @Version 1.0
 */
public class CommonEmployee extends Employee {
    //工作内容，这个非常重要，以后的职业规划就是靠这个了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
