package com.company;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Testy {
    private static final String key = "aesEncryptionKey";
    private static final String initTable = "encryptionIntVec";

    public static void CorruptionTest() throws Exception
    {
        String originalString = "His palms are sweaty, knees weak, arms are heavy";
        System.out.println(originalString);
        String encryptedString = encrypt(originalString);
        System.out.println("Dec: "+encryptedString);
        Testy.Test(5, originalString);
        Testy.Test(10, originalString);
        Testy.Test(15, originalString);
    }

    private static void Test(int counter, String original) throws Exception
    {
        String encrypted = encrypt(original);
        var encryptedNew = Base64.getDecoder().decode(encrypted);
        for (int i=0;i<counter;i++) encryptedNew[i] =2;
        var changed = Base64.getEncoder().encodeToString(encryptedNew);
        String decrypted = decrypt(changed);
        System.out.println(counter+" changed bits. After dec: "+ decrypted+"\n");

    }

    private static String decrypt(String changed)
    {
        try {
            IvParameterSpec iv = new IvParameterSpec(initTable.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(changed));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    private static String encrypt(String originalString) throws Exception
    {
        try {
            IvParameterSpec iv = new IvParameterSpec(initTable.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(originalString.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        }
        catch (Exception e)
        {e.printStackTrace();}
        return null;
    }
}

