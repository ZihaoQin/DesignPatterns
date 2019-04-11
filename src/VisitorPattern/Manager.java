package VisitorPattern;

/**
 * @ClassName:Manager.java
 * @Description:TODO （领导）
 * @Author:qzh
 * @Date: 2019/4/4 14:40
 * @Version 1.0
 */
public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
