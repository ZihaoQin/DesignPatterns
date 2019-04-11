package IteratorPattern.project;

import IteratorPattern.iterator.IProjectIterator;
import IteratorPattern.iterator.ProjectIterator;

import java.util.ArrayList;

/**
 * @ClassName:Project.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 12:26
 * @Version 1.0
 */
public class Project implements IProject {

    private ArrayList<IProject> projectArrayList = new ArrayList<IProject>();


    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectArrayList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        info = info + "项目名称是：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectArrayList);
    }


}
