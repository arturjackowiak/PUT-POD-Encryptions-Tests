package com.company;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Decrypt
{
    private static final String key = "aesEncryptionKey";
    private static final String initTable = "encryptionIntVec";

    public static String Decrypt(byte[] encrypted, String mode) throws Exception
    {
        IvParameterSpec ivSpec = new IvParameterSpec(initTable.getBytes("UTF-8"));
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        Cipher cipher;

        switch (mode)
        {
            case "ECB":
                cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec);
                break;
            case "CBC":
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
                break;
            case "OFB":
                cipher = Cipher.getInstance("AES/OFB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
                break;
            case "CFB":
                cipher= Cipher.getInstance("AES/CFB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
                break;
            case "CTR" :
                cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
                break;
            default:
                cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec);
                break;
        }
        return byteArrayToString(cipher.doFinal(encrypted));
    }
    private static String byteArrayToString(byte[] encrypted)
    {
        String decrypted = new String(encrypted);
        return decrypted;
    }
}
