package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class Test {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка
        System.out.println(list);
        Integer rem = list.remove(3);
        list.add(0, 100);
        list.add(3, 99);
        System.out.println(rem);
        System.out.println(list);
    }

}