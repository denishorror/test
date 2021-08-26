package iterator;

import java.util.Iterator;

import java.util.TreeSet;



public class TreeSetExample {

    public static void main(String[] args)

    {

        TreeSet<Integer>

                ts = new TreeSet<Integer>();

        ts.add(10);

        ts.add(61);

        ts.add(87);

        ts.add(39);



        // Создаем итератор над TreeSet

        Iterator<Integer> iterator = ts.iterator();



        // Цикл по значениям TreeSet

        // и выводим значения

        System.out.print("TreeSet: ");

        while (iterator.hasNext())

            System.out.print(iterator.next()

                    + ", ");

        System.out.println();

    }

}

