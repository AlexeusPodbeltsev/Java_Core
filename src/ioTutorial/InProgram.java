package ioTutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class InProgram {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("/Users/apple/Downloads/IO.txt")) {
            System.out.printf("File size:  %d bytes \n", fin.available());
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
