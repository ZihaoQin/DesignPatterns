package AdapterPattern.outerUser;

import java.util.Map;

/**
 * @InterfaceName:IOuterUser
 * @Description:TODO（外系统的人员信息）
 * @Author:qzh
 * @Date: 2019/3/28 10:38
 * @Version 1.0
 */
@SuppressWarnings("all")
public interface IOuterUser {
    //基本信息，比如名称，性别，手机号等
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户的家庭信息
    public Map getUserHomeInfo();

}
