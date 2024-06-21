import java.util.*;
import java.io.*;

class Test {


    private static void change(String s) {
        s = "BCD";
    }

    public static void main(String[] args) {
        String s = new String("abc");
        System.out.println();
        change(s);
        System.out.println(s);

    }

}