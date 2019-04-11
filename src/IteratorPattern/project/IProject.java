package IteratorPattern.project;

import IteratorPattern.iterator.IProjectIterator;

/**
 * @InterfaceName:IProject
 * @Description:TODO（）
 * @Author:qzh
 * @Date: 2019/3/31 12:26
 * @Version 1.0
 */
public interface IProject {

    public void add(String name,int num,int cost);
    public String getProjectInfo();
    public IProjectIterator iterator();
}
