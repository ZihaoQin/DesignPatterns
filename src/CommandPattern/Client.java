package CommandPattern;

import CommandPattern.command.AddRequirementCommand;
import CommandPattern.command.DeletePageCommand;
import CommandPattern.group.RequirementGroup;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:22
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Invoker xiaosan = new Invoker();

        System.out.println("-------------客户要求增加一项需求-----------------");
        xiaosan.setCommand(new AddRequirementCommand());
        xiaosan.action();

        xiaosan.setCommand(new DeletePageCommand());
        xiaosan.action();

    }
}
