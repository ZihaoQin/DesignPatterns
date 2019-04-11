package MultitionPattern;

/**
 * @ClassName:Minitor.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/26 20:34
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 10;//10个大臣
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = new Emperor().getInstance();
            System.out.println("第"+i+"个大臣参拜的是：");
            emperor.empererInfo();
        }
    }
}
