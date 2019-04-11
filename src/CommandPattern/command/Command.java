package CommandPattern.command;

import CommandPattern.group.CodeGroup;
import CommandPattern.group.PageGroup;
import CommandPattern.group.RequirementGroup;

/**
 * @ClassName:Command.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:50
 * @Version 1.0
 */
public abstract class Command {
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
