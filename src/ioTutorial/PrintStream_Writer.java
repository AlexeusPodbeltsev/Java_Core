package ioTutorial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_Writer {
    public static final PrintStream out = null;
    public static void main(String[] args) {

//        printStreamEx();
    }

    static void printStreamEx() {
        String txt = "Hello, ma friend";
        try (FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/print.txt");
             PrintStream ps = new PrintStream(fos))
        {
            ps.print(txt);
            System.out.println("Запись в файл произведена");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
