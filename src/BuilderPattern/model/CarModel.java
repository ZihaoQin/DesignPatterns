package BuilderPattern.model;

import java.util.ArrayList;

/**
 * @ClassName:CarModel.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 16:13
 * @Version 1.0
 */
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run(){
        for (int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")){
                this.start();//开启汽车
            }else if (actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if (actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if (actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
