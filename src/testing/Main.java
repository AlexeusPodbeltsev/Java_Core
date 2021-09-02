package testing;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) throws IOException {
        String charset = Charset.defaultCharset().displayName();
        String strTest = "Ћбў Ёў Ґ¬";
        String str = "Осваиваем";


        byte[] bytes = strTest.getBytes();
        InputStreamReader inputStreamReader = new InputStreamReader(
                new ByteArrayInputStream(bytes));
        int i;
        System.out.println(strTest);
        while ((i = inputStreamReader.read()) != -1){
            System.out.print(String.format("%x",i)  + " ");
        }


    }
}
