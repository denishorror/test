package Yandex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Anagrams {
    public static void main(String[] args) throws Exception {

//        File file = new File("input.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        String greetings = "qiu\n" +
//                "iuq";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();


        String inputFileName = "input.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {
            String line1 = r.readLine();
            String line2 = r.readLine();
            char[] ar1 = line1.toCharArray();
            char[] ar2 = line2.toCharArray();
            int [] result = new int[ar1.length];
            for (int i = 0; i < ar1.length; i++) {
                result [i] = 0;
                for (int j = 0; j < ar2.length; j++) {
                    if (ar1 [i] == ar2 [j]) {
                        result [i] ++;
                    }
                }
            }
            System.out.println((
                            (line2.matches("[a-z]+"))
                            && (line1.matches("[a-z]+"))
                            && (ar1.length == ar2.length)
                            && (Arrays.stream(result).sum() == ar1.length)
            )? 1 : 0);
        }
    }
}
