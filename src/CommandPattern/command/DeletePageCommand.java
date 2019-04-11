package CommandPattern.command;

/**
 * @ClassName:DeletePageCommand.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:59
 * @Version 1.0
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
