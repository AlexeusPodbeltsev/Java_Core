package testing;

public class StringTime {
    public static void main(String[] args) {
        String str = "bbbb";
//        String newStr = "";

        StringBuilder newStr = new StringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            newStr.append(str).append( "\n");
//            newStr += str + "\n";
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(newStr.length());


    }
}
