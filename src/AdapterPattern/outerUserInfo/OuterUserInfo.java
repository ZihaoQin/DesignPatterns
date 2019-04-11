package AdapterPattern.outerUserInfo;

import AdapterPattern.outerUser.OuterUser;
import AdapterPattern.userInfo.IUserInfo;

import java.util.Map;

/**
 * @ClassName:OuterUserInfo.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 12:08
 * @Version 1.0
 */
@SuppressWarnings("all")
public class OuterUserInfo extends OuterUser implements IUserInfo{
    private Map baseInfo = super.getUserBaseInfo();//员工的基本信息
    private Map homeInfo = super.getUserHomeInfo();//员工的家庭信息
    private Map officeInfo = super.getUserOfficeInfo();//工作信息
    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
