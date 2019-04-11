package CompositePattern;

import CompositePattern.Corp;

import java.util.ArrayList;

/**
 * @ClassName:Branch.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/1 19:56
 * @Version 1.0
 */
public class Branch extends Corp {


    //领导下标有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    //通过构造函数传递树枝节点的参数
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }



    public void addSubordinate(Corp corp) {
        corp.setParent(this);//设置父节点
        this.subordinateList.add(corp);
    }


    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
