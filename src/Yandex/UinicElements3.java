package Yandex;

import java.io.*;
import java.util.TreeSet;

public class UinicElements3 {
    public static void main(String[] args) {

//        File file = new File("input.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        String greetings = "5\n" +
//                "2\n" +
//                "4\n" +
//                "8\n" +
//                "8\n" +
//                "8\n";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();

        TreeSet <String> set = new TreeSet();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if (i != 0) set.add(line);
                i++;
            }
            for (String result : set) {
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
