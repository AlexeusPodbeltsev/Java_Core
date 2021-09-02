package initializerTutorial;

public class StaticInitializer {

    public static void main(String[] args) {
        Person vasya = new Person();
        Person tolya = new Person();
        vasya.displayId();
        tolya.displayId();
    }
}

 class Person {
    private int id;
    private static int count;

    public Person() {
        id = count++;
        System.out.println("Constructor");
    }

    static {
        count = 105;
        System.out.println("Static initializer");
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }


}
