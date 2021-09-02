package ioTutorial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutProgram {
    public static void main(String[] args) {

        String string = "hello, world";
        try
        {
            File file = new File("/Users/apple/Downloads/22/");
            boolean created = file.mkdir();
            if(created)
                System.out.println("Folder has been created");
            FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/22/IO.txt");
            byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
            fos.write(buffer);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The file has been written");
        }
    }
}
