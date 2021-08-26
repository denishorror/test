package generics;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String []args){
        List list = new ArrayList();
        list.add("Hello");
        String text = list.get(0) + ", world!";
        System.out.print(text);
    }
}

