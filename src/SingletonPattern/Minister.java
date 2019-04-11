package SingletonPattern;

/**
 * @ClassName:Minister.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 13:40
 * @Version 1.0
 */

@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {

        Emperor emperor = Emperor.getInstance();
        emperor.emperorInfo();

        Emperor emperor2=Emperor.getInstance();
        emperor2.emperorInfo();

        Emperor emperor3=Emperor.getInstance();
        emperor3.emperorInfo();
    }
}
