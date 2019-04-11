package PrototypePattern;

import java.util.Random;

/**
 * @ClassName:Client.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/5 21:49
 * @Version 1.0
 */
public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            //以下是没封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            //发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i=0;i<maxLength;i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();

    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功！");
    }
}
