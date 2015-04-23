package PasswordEncrypt;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by wzyoung on 2015/4/23.
 */
public class EncryptUtil {

    public static void main(String[] args) throws NoSuchAlgorithmException {


        long start = System.currentTimeMillis();

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

        String source = "atool.org";

        String source2 = "password";

        byte[] salt = getRandomSalt();

        System.out.println("salt:" + toHex(salt));

        messageDigest.update(salt);
        byte[] pwd = messageDigest.digest(source.getBytes());

        byte[] pwd2 = messageDigest.digest(source2.getBytes());

        System.out.println(toHex(pwd));


        System.out.println(slowEquals(pwd, pwd2));

        long end = System.currentTimeMillis();

        System.out.println("cost:" + (end - start));

    }


    public static byte[] getRandomSalt() {
        byte[] salts = new byte[32];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(salts);
        return salts;
    }

    public static boolean slowEquals(byte[] a, byte[] b) {
        int diff = a.length ^ b.length;
        for (int i = 0; i < a.length && i < b.length; i++)
            diff |= a[i] ^ b[i];
        return diff == 0;
    }

    /**
     * Converts a string of hexadecimal characters into a byte array.
     *
     * @param hex the hex string
     * @return the hex string decoded into a byte array
     */
    public static byte[] fromHex(String hex) {
        byte[] binary = new byte[hex.length() / 2];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return binary;
    }

    /**
     * Converts a byte array into a hexadecimal string.
     *
     * @param array the byte array to convert
     * @return a length*2 character string encoding the byte array
     */
    public static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0)
            return String.format("%0" + paddingLength + "d", 0) + hex;
        else
            return hex;
    }

    public static String md5(String password) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        return toHex(messageDigest.digest(password.getBytes()));
    }


    public static String sha256(String password, String salt) {

        MessageDigest messageDigest = null;

        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(salt.getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        if (null != messageDigest) {
            byte[] pwd = messageDigest.digest(password.getBytes());
            return toHex(pwd);
        }
        return null;


    }
}
