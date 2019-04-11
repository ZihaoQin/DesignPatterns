package DecoratorPattern.report;

/**
 * @ClassName:FouthGradeSchoolReport.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 23:07
 * @Version 1.0
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
