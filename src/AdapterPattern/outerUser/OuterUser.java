package AdapterPattern.outerUser;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:OuterUser.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/28 11:05
 * @Version 1.0
 */
public class OuterUser implements IOuterUser {

    /*用户的基本信息*/
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber","这个员工电话是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的值为是BOOS...");
        officeInfo.put("officeTelNumber","员工的办公电话是...");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是....");
        homeInfo.put("homeAddress", "员工的家庭地址是....");
        return homeInfo;
    }
}
