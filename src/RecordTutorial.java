public class RecordTutorial {

    public static void main(String[] args) {
        Persona tom = new Persona("Tom",22);
        System.out.println(tom);
    }
}
record Persona(String name, int age){

    Persona {
        if (age < 1 || age > 100)age = 18;
    }
}

