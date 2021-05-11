package com.company;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt
{
    private static final String key = "aesEncryptionKey";
    private static final String initTable = "encryptionIntVec";

    public static byte[] Encrypt (String in, String mode) throws Exception
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
            case "OFB":
                cipher = Cipher.getInstance("AES/OFB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec,ivSpec);
                break;
            case "CTR":
                cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec,ivSpec);
                break;
            case "CBC":
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec,ivSpec);
                break;
            case "CFB":
                cipher = Cipher.getInstance("AES/CFB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec,ivSpec);
                break;
            default:
                cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, keySpec);
                break;
        }

        if(mode == "ECB")
            return cipher.doFinal(in.getBytes());
        else return cipher.doFinal(in.getBytes("UTF-8"));

    }
}
