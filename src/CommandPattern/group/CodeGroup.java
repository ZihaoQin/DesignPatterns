package CommandPattern.group;

/**
 * @ClassName:CodeGroup.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/30 21:20
 * @Version 1.0
 */
public class CodeGroup extends Grop {
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
