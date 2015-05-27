package PasswordEncrypt;

import java.security.NoSuchAlgorithmException;

/**
 * Created by wzyoung on 2015/4/23.
 */
public class Client {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String usrname = "admin";

        String password = "12345";
        regist(usrname, password);

    }

    public static boolean regist(String username, String password) {

        // 获取随机盐值

        String salt = EncryptUtil.toHex(EncryptUtil.getRandomSalt());
//        EncryptUtil.md5(password);

        String encryptPwd = EncryptUtil.sha256(password, salt);

        System.out.println("password" + password);

        System.out.println("salt" + salt);

        System.out.println("enP wd" + encryptPwd);

        return true;
    }


}
