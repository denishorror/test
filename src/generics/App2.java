package generics;

import java.util.*;
public class App2 {
    public static void main(String []args){
        List<String> list = new ArrayList<>();
        list.add("Hello!");
//        list.add(123);
        list.add("123");
        for (Object str : list) {
            System.out.println(str);
        }
    }
}