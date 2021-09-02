package ioTutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreams {
    public static void main(String[] args) {
        zipOutput();
//        zipInput();
    }
    public static void zipOutput(){
        String filename = "/Users/apple/Downloads/BufferTxt.txt";

        try (ZipOutputStream zipOutputStream =
                     new ZipOutputStream(new FileOutputStream("/Users/apple/Downloads/output.zip"));
             FileInputStream fis = new FileInputStream(filename)){
            ZipEntry zipEntry = new ZipEntry("BufferTxt.txt");
            zipOutputStream.putNextEntry(zipEntry);
            // считываем содержимое файла в массив byte
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            // добавляем содержимое к архиву
            zipOutputStream.write(bytes);
            // закрываем текущую запись для новой запис

            zipOutputStream.closeEntry();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    public static void zipInput(){
        try (ZipInputStream zin = new ZipInputStream(
                new FileInputStream("/Users/apple/Downloads/output.zip")))
        {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry())!=null){
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);
                FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/New" + name);
                for (int i = zin.read(); i != -1 ; i = zin.read()) {
                    fos.write(i);
                }
                fos.flush();
                zin.closeEntry();
                fos.close();
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }


    }
}
