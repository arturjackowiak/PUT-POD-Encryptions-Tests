package com.company;

import java.io.File;
import java.util.Scanner;

public class IO
{

    private static final String key = "aesEncryptionKey";
    private static final String initTable = "encryptionIntVec";

    public static String readFile(String fileName) throws Exception
    {
        var path = "POD\\" + fileName +".txt";  
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String readString = scan.nextLine();
        return readString;
    }

    public static byte[] encMode(String mode, String output, String fileName) throws Exception
    {
        String line = "";
        String encRes = "";
        var readString = readFile(fileName);
        var encrypted = Encrypt.Encrypt(readString,mode);
        return encrypted;

    }

    public static void decMode (String mode, byte[] in) throws Exception
    {
        String line = "";
        String decRes = "";
        double start = System.nanoTime();
        var decrypted = Decrypt.Decrypt(in,mode);
        double estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+ estimated/1000000000);
    }
}
