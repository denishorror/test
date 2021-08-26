package test;

import java.util.*;

public class CompareValues {
    public static void main(String[] args) {
        Integer [][] a = {{-1, -2, 4, 5, 6, 1, 2, 3, 3, 3, 1, 1, 1}, {54, 6, 7, 8, 1, 3, 5, 1}, {1, 6, 9, 1, 0, 2, 1}};
        TreeSet<Integer> ts = new TreeSet<>();


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                ts.add(a[i][j]);
            }
        }

        System.out.println("ts: " + ts);

        List<Integer> a0 = Arrays.asList(a[0]);
        List<Integer> a1 = Arrays.asList(a[1]);
        List<Integer> a2 = Arrays.asList(a[2]);

        System.out.println("a0: " + a0);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

        for (Integer value : ts) {
            if (a0.contains(value) && a1.contains(value) && a2.contains(value)){
                System.out.println(value + " Success!");
                break;
            }

        }

    }
}