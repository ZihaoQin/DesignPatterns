package DecoratorPattern;

import DecoratorPattern.decorator.HighScoreDecorator;
import DecoratorPattern.decorator.SortDecorator;
import DecoratorPattern.report.FouthGradeSchoolReport;
import DecoratorPattern.report.SchoolReport;
import DecoratorPattern.report.SugarFouthGradeSchoolReport;

/**
 * @ClassName:Father.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 23:10
 * @Version 1.0
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport;
        schoolReport = new FouthGradeSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);

        schoolReport.report();
        schoolReport.sign("老三");
    }
}
