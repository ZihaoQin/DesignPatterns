package IteratorPattern;

import IteratorPattern.iterator.IProjectIterator;
import IteratorPattern.project.IProject;
import IteratorPattern.project.Project;

import java.util.ArrayList;

/**
 * @ClassName:Boss.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/31 12:31
 * @Version 1.0
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();

        //增加星球大战项目
        project.add("星球大战项目ddddd",10,100000);
        //增加扭转时空项目
        project.add("扭转时空项目",100,10000000);
        //增加超人改造项目
        project.add("超人改造项目",10000,1000000000);

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject next = (IProject) projectIterator.next();
            System.out.println(next.getProjectInfo());
        }

    }
}
