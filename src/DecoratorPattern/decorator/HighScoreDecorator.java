package DecoratorPattern.decorator;

import DecoratorPattern.decorator.Decorator;
import DecoratorPattern.report.SchoolReport;

/**
 * @ClassName:HighScoreDecorator.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 11:29
 * @Version 1.0
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
