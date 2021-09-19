package lambdas;

public class LambdaAsResultOfMethods {
    public static void main(String[] args) {
        Operation func = action(1);
        System.out.println(func.execute(5, 6));
        func = action(3);
        System.out.println(func.execute(5, 6));
    }

    private static Operation action(int i) {
        return switch (i) {
            case 1 -> (x, y) -> x + y;
            case 2 -> (x, y) -> x - y;
            case 3 -> (x, y) -> x * y;
            default -> (x, y) -> 0;
        };
    }

}

@FunctionalInterface
interface Operation {
    int execute(int x, int y);
}

