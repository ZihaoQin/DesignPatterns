package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/4 14:52
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(showVisitor);
            emp.accept(totalVisitor);
        }

        showVisitor.report();
        System.out.println("==========");
        totalVisitor.totalSalary();
    }

    private static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);

        return empList;
    }
}
