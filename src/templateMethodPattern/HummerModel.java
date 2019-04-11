package templateMethodPattern;

/**
 * @ClassName:HummerModel.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 13:30
 * @Version 1.0
 */
public abstract class HummerModel {
    /*
        * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
        * 是要能够发动起来，那这个实现要在实现类里了
    */

    //使用protected保证不该暴露的方法暴露
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    //子类不可修改

    //这里的run就是模板方法，模板方法是通过汇总或排序基本方法而产生的结果集
    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    //钩子方法
    protected boolean isAlarm(){
        return true;
    }
}
