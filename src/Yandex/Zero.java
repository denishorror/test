package Yandex;

import java.util.ArrayList;

public class Zero {
    public static void main(String[] args)  {
        int[] a = {1, 2, 0, 4, 0, 5};
//        ArrayList <Integer> arrayList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
//            if (a[i] != 0) arrayList.add(a[i]);
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
//        int diff = a.length - arrayList.size();
////        System.out.println(diff);
////        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        for (int i = 0; i < diff; i++) {
//            arrayList.add(0);
//        }
//        System.out.println(arrayList);

    }
}

