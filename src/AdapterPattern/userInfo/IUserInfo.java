package AdapterPattern.userInfo;

/**
 * @InterfaceName:IUserInfo
 * @Description:TODO（）
 * @Author:qzh
 * @Date: 2019/3/28 10:26
 * @Version 1.0
 */
public interface IUserInfo {
    //获得用户姓名
    public String getUserName();

    //获得家庭地址
    public String getHomeAddress();

    //手机号码
    public String getMobileNumber();

    //办公电话
    public String getOfficeTelNumber();

    //这个人的职位是啥
    public String getJobPosition();

    //获得家庭电话
    public String getHomeTelNumber();
}
