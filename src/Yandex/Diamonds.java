package Yandex;

import java.io.*;

public class Diamonds {
    public static void main(String[] args) throws Exception {

//        File file = new File("input.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        String greetings = "ab\n" +  "aabbccd";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();


        String inputFileName = "input.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {
            String J = r.readLine();
            String S = r.readLine();
            int result = 0;
            for (int i = 0; i < S.length(); ++i) {
                char ch = S.charAt(i);
                if (J.indexOf(ch) >= 0) {
                    ++result;
                }
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}