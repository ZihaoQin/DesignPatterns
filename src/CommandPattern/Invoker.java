package CommandPattern;

import CommandPattern.command.Command;

/**
 * @ClassName:Invoker.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 22:00
 * @Version 1.0
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
