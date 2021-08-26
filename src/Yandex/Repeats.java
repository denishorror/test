package Yandex;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Repeats {
    public static void main(String[] args) throws Exception {

//        File file = new File("input.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        String greetings = "5\n" +
//                "1\n" +
//                "0\n" +
//                "1\n" +
//                "6\n" +
//                "6\n" +
//                "6\n" +
//                "6\n" +
//                "0\n" +
//                "1\n";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();


        String inputFileName = "input.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            while ((line = r.readLine()) != null) {
                arrayList.add(line);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                result.add(i, Collections.frequency(arrayList, arrayList.get(i)));
            }
            System.out.println(arrayList.get(result.indexOf(Collections.max(result))));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
