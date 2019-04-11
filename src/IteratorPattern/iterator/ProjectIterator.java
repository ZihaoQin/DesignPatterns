package IteratorPattern.iterator;

import IteratorPattern.project.IProject;

import java.util.ArrayList;

/**
 * @ClassName:ProjectIterator.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 13:02
 * @Version 1.0
 */
public class ProjectIterator implements IProjectIterator {

    //所有的项目都放在这里ArrayList中
    private ArrayList<IProject> projectArrayList = new ArrayList<IProject>();

    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectArrayList) {
        this.projectArrayList = projectArrayList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectArrayList.size() || this.projectArrayList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return (IProject) this.projectArrayList.get(this.currentItem++);
    }



}
