package CommandPattern.command;

/**
 * @ClassName:AddRequirementCommand.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:57
 * @Version 1.0
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
