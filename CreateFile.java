package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateFile {

    static long convert (int _size){
        long size = _size * 1048576;
        return size;
    }

    static void createFile(int _size, String _fileName, String _text) throws IOException {
            long size = convert(_size);
            FileWriter writer = new FileWriter(_fileName +".txt");
            for(int i = 0;i <= size/_text.length(); i++)
            {
                writer.write(_text);
            }
            writer.close();
    }

    static void CreateFiles() throws Exception
    {
        createFile(1, "1MBfile", "YOU ARE IN PAIN TAKE YOUR LIFE TAKE YOUR LIFE WITH COCAINE ");
        createFile(100, "100MBfile", "YOU ARE IN PAIN TAKE YOUR LIFE TAKE YOUR LIFE WITH COCAINE ");
        createFile(250, "250MBfile", "YOU ARE IN PAIN TAKE YOUR LIFE TAKE YOUR LIFE WITH COCAINE ");
    }

}
