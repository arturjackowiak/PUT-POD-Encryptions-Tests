package com.company;

import java.io.PrintWriter;

import static com.company.CreateFile.*;


public class Main {

    public static void main(String[] args) throws Exception
    {
        System.out.println("Creating Files");
        CreateFiles();
        System.out.println("Files created");

        System.out.println("1MB File: ");
        System.out.println("==================================");
	    String trybAES = "ECB", output = "ECB", plik = "1MBfile";
        System.out.println("Enc ECB: ");
        double start = System.nanoTime();
        var encrypted = IO.encMode(trybAES, output,plik);
        double estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec ECB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CBC";
        output = "CBC";
        System.out.println("Enc CBC: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CBC: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "OFB";
        output="OFB";
        System.out.println("Enc OFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec OFB: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "CFB";
        output = "CFB";
        System.out.println("Enc CFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CFB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CTR";
        output = "CTR";
        System.out.println("Enc CTR: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CTR: ");
        IO.decMode(trybAES,encrypted);





        System.out.println();
        System.out.println("100MB File: ");
        System.out.println("==================================");

        plik = "100MBfile";
        trybAES = "ECB";
        output = "ECB";
        System.out.println("Enc ECB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec ECB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CBC";
        output = "CBC";
        System.out.println("Enc CBC: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CBC: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "OFB";
        output="OFB";
        System.out.println("Enc OFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec OFB: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "CFB";
        output = "CFB";
        System.out.println("Enc CFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CFB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CTR";
        output = "WynikCTR";
        System.out.println("Enc CTR: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CTR: ");
        IO.decMode(trybAES,encrypted);



        System.out.println();
        System.out.println("250MB File: ");
        System.out.println("==================================");

        plik = "250MBfile";
        trybAES = "ECB";
        output = "ECB";
        System.out.println("Enc ECB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec ECB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CBC";
        output = "CBC";
        System.out.println("Enc CBC: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CBC: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "OFB";
        output="OFB";
        System.out.println("Enc OFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec OFB: ");
        IO.decMode(trybAES,encrypted);

        trybAES = "CFB";
        output = "CFB";
        System.out.println("Enc CFB: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CFB: ");
        IO.decMode(trybAES, encrypted);

        trybAES = "CTR";
        output = "CTR";
        System.out.println("Enc CTR: ");
        start = System.nanoTime();
        encrypted = IO.encMode(trybAES, output,plik);
        estimated = System.nanoTime() - start;
        System.out.println("Time in seconds: "+estimated/1000000000);
        System.out.println("Dec CTR: ");
        IO.decMode(trybAES,encrypted);

        System.out.println("Tests: ");
        Testy.CorruptionTest();
    }

}
