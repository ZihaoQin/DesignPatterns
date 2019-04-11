package DecoratorPattern.decorator;

import DecoratorPattern.report.SchoolReport;

/**
 * @ClassName:SortDecorator.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 12:00
 * @Version 1.0
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
