package CommandPattern.group;

import CommandPattern.group.Grop;

/**
 * @ClassName:RequirementGroup.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:18
 * @Version 1.0
 */
public class RequirementGroup extends Grop {
    @Override
    public void find() {
        System.out.println("找到需求组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
