package ioTutorial;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FilesAndDirectories {
    public static void main(String[] args) {
        /*
            get_ls_command("/Users/apple/Java/");
        operateWithDirectory();
         */
        operateWithFile();
    }
    public static void get_ls_command(String directory){
        File dir = new File(directory);
        if (dir.isDirectory()){
            for (File item: Objects.requireNonNull(dir.listFiles())
                 ) {
                if (item.isDirectory()) System.out.println(item.getName() + "  \t folder");
                else System.out.println(item.getName() + "  \t file");
            }
        }
    }
    public static void operateWithDirectory(){
        File dir = new File("/Users/apple/Java/NewDir");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        // переименуем каталог
        File newDir = new File("/Users/apple/Java/NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");
    }

    public static void operateWithFile(){
        // определяем объект для каталога
        File myFile = new File("/Users/apple/Downloads/persons.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File("/Users/apple/Downloads/smth.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
