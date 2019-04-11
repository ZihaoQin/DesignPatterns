package DecoratorPattern.decorator;

import DecoratorPattern.report.SchoolReport;

/**
 * @ClassName:Decorator.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 11:24
 * @Version 1.0
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
