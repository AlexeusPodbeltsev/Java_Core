package ioTutorial;

import java.io.*;

public class Buffered_Writer_Reader {
    public static void main(String[] args) {
        writerEx();
        readerEx("/Users/apple/Downloads/BufferTxt.txt");
    }

    public static void writerEx() {
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("/Users/apple/Downloads/BufferTxt.txt"))) {
            String text = "Hello  World!\nHey! Teachers! Leave them kids alone.";
            bw.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readerEx(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {

                System.out.println(s);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
