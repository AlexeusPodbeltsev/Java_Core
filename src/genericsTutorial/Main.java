package genericsTutorial;

public class Main {
    public static void main(String[] args) {
        /*
        BoxPrinter<Integer> integerBoxPrinter = new BoxPrinter<>(12);
        int val1 = integerBoxPrinter.getValue();
        BoxPrinter<String> stringBoxPrinter = new BoxPrinter<>("Hello, World");
        String val2 = stringBoxPrinter.getValue();
         */

        printAnyElement(new Integer[]{1,3,4,5,2});
        printAnyElement(new String[]{"Hello","there","feel","free"});

    }

    public static <T> void printAnyElement(T[]array){
        for (T val:array
             ) {
            System.out.println(val);
        }
    }
}
