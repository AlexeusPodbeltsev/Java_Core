package genericsTutorial;

import java.util.ArrayList;
import java.util.List;

public class WildcardParameters {
    public static void main(String[] args) {

        /*
        List<?> intList = new ArrayList<Integer>();
        intList.add(new Integer(10));
        intList.add(new Float(10.0f)); даже с закомментированной последней строкой не скомпилируется */

        /*

        List<? extends Number> numList = new ArrayList<Integer>();
        numList = new ArrayList<String>();

        Данный код не скомпилируется, а всё из-за того, что с помощью маски мы задали ограничение.
        Переменная numList может хранить ссылку только на список, содержащий элементы унаследованные от Number,
         а всё из-за объявления: List<? extends Number> numList. Тут мы видим, как маске задаётся ограничение –
         теперь numList предназначен для списка с ограниченным количеством типов.

         */
        List<? super Integer> intList = new ArrayList<Integer>();
        intList = new ArrayList<Number>();
    }
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }
}
