package ioTutorial;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 1.68, true);
        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Name: %s  Age: %d Height: %f Married: %b", name, age, height, married);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}