package ioTutorial;

import java.io.*;
import java.util.Arrays;

public class FileWriter_Reader {
    public static void main(String[] args) {
        fileReader();
    }

    public static void fileWrite() {
        try (FileWriter fl = new FileWriter("/Users/apple/Downloads/IO.txt")) {
            String text = "\n Hello Golden Apple";
            fl.write(text);
            fl.write('\n');
            fl.append('B');
            fl.write('\n');
            fl.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void fileReader() {
        try (FileReader reader = new FileReader("/Users/apple/Downloads/IO.txt")) {
//            System.out.println("читаем посимвольно");
            int c;
//            while ((c = reader.read()) != -1) {
//
//                System.out.print((char) c);
//            }
            System.out.println("Также мы можем считывать в промежуточный буфер из массива символов:");
            char[] buffer = new char[256];
            while ((c = reader.read(buffer)) > 0) {
                if (c < 256) {
                    buffer = Arrays.copyOf(buffer, c);
                }
                System.out.print(buffer);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
