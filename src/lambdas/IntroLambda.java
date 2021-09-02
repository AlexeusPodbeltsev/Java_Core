package lambdas;

public class IntroLambda {
    public static void main(String[] args) {
        Operationable operationable = (x, y)->x+y;
        int result  = operationable.sum(20,12);
        System.out.println(result);
    }
}
@FunctionalInterface
interface Operationable {
    int sum(int x, int y);
}
