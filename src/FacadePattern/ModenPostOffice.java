package FacadePattern;

/**
 * @ClassName:ModenPostOffice.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/3/27 22:38
 * @Version 1.0
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    private  Police police = new Police();
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);

        police.checkLetter(letterProcess);

        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
