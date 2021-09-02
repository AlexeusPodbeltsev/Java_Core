package ioTutorial;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        SerializablePerson sam = new SerializablePerson("Sam", 33, 178, true);
//        serializeOut(sam);
        try {
            SerializablePerson stranger = serializeIn();
            System.out.printf("Name: %s \t Age: %d \n", stranger.getName(), stranger.getAge());
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }

    public static void serializeOut(SerializablePerson person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/Users/apple/Downloads/persons.txt"))) {
            oos.writeObject(person);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static SerializablePerson serializeIn() throws IOException, ClassNotFoundException {
        SerializablePerson person;
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/apple/Downloads/persons.txt"));
         person = (SerializablePerson) ois.readObject();
         ois.close();
         return person;

    }
}


class SerializablePerson implements Serializable {
    private String name;
    private int age;
    private double height;
    private boolean married;

    SerializablePerson(String n, int a, double h, boolean m) {

        name = n;
        age = a;
        height = h;
        married = m;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeight() {
        return height;
    }

    boolean getMarried() {
        return married;
    }
}

