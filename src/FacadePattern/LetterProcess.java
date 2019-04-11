package FacadePattern;

/**
 * @InterfaceName:LetterProcess
 * @Description:TODO（）
 * @Author:qzh
 * @Date: 2019/3/27 22:28
 * @Version 1.0
 */
public interface LetterProcess {
    //首先要写信的内容
    public void writeContext(String context);

    //其次写信封
    public void fillEnvelope(String address);

    //把信放到信封里
    public void letterInotoEnvelope();

    //然后邮递
    public void sendLetter();
}
