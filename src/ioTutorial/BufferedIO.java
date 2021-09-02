package ioTutorial;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedIO {
    public static void main(String[] args) {
        checkBufferedInput();
        checkBufferedOutput();
    }

    static void checkBufferedInput() {
        String text = "Hello, World";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    static void checkBufferedOutput() {
        String text = "Hello, World";
        byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream out = new FileOutputStream("note.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            bos.write(buffer,0,buffer.length);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
