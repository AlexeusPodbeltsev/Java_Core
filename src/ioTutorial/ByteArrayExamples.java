package ioTutorial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayExamples {
    public static void main(String[] args) {
        byte[] bytes = {1, 3, 5};
        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        int b;
        while ((b = bin.read()) != -1) {
            System.out.println(b);
        }
        //============================================≠==========================
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {

            System.out.print((char) c);
        }
        System.out.println();
        //============================================≠==========================
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.print(baos + "\n");


        byte[] bytes1 = baos.toByteArray();
        for (byte _byte : bytes1
        ) {
            System.out.print((char) _byte);
        }
        writeToCheck();
    }

    public static void writeToCheck() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello world";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (FileOutputStream fos = new FileOutputStream("Hello.txt")){
            baos.writeTo(fos);
            System.out.print("The file has been written");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
