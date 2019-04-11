package AdapterPattern;

import AdapterPattern.outerUserInfo.OuterUserInfo;
import AdapterPattern.userInfo.IUserInfo;
import AdapterPattern.userInfo.UserInfo;

/**
 * @ClassName:App.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 10:34
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        //IUserInfo youngGirl = new UserInfo();

        IUserInfo youngGirl = new OuterUserInfo();
        for (int i=0;i<5;i++){
            youngGirl.getMobileNumber();
        }

    }
}
