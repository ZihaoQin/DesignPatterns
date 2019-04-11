package CompositePattern;

/**
 * @ClassName:Corp.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/2 14:44
 * @Version 1.0
 */
public abstract class Corp {
    //公司每个人都有名称
    private String name = "";
    private String position = "";
    private int salary = 0;

    //父节点是谁
    private Corp parent = null;


    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public String getInfo(){
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    protected void setParent(Corp _parent){
        this.parent = _parent;
    }
    public Corp getParent(){
        return this.parent;
    }
}
