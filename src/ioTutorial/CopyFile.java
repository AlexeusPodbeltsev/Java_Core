package ioTutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
//    public static void main(String[] args) {
//        try(FileInputStream fin = new FileInputStream("/Users/apple/Downloads/IO.txt");
//            FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/CopyIO.txt",true) )
//        {
//            byte[] buffer = new byte[fin.available()];
//           // считываем буфер
//            fin.read(buffer,0, buffer.length);
//           //записываем из буфера в файл
//            fos.write(buffer);
//            System.out.println("The file has been written");
//
//        }catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("/Users/apple/Downloads/IO.txt");
             FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/CopyIO.txt")) {
            byte[] buffer = new byte[fin.available()];
                fin.read(buffer,0,buffer.length);
            fos.write(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
