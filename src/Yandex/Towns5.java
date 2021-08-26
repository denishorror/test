package Yandex;

import java.io.*;
import java.util.ArrayList;

public class Towns5 {
    public static void main(String[] args) throws Exception {

        String inputFileName = "input.txt";

                File file = new File(inputFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String greetings = "2\n" +
                "0 0\n" +
                "0 2\n" +
                "2 2\n" +
                "0 -2\n" +
                "2 -2\n" +
                "2 -1\n" +
                "2 1\n" +
                "2\n" +
                "1 3\n";
        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();


        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {

            String line;
            int cities = 0;
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();

            // передали в ArrayList
            while ((line = r.readLine()) != null) {
                arrayList.add(line);
            }

            // обработка
            try {
                cities = Integer.parseInt(arrayList.get(0));
                if ((cities > 1000) || (cities < 2)) {
                    success (-1);
                }
            } catch (Exception e) {
                success (-1);
            }

            int[][] coords = new int[2][cities];
            for (int i = 0; i < cities; i++) {
                try {
                    String[] str = arrayList.get(i + 1).split(" ");
                    System.out.println("str 0 " + str[0]);
                    System.out.println("str 1 " + str[1]);
                    coords [0][i]  = Integer.valueOf(str[0]);
                    coords [1][i]  = Integer.valueOf(str[1]);
                } catch (Exception e) {
                    success (-1);
                }
            }
            System.out.println(arrayList);
            for (int i = 0; i < cities; i++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("coords: " + coords [k][i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    protected static void success(int flag) {
        System.out.println(flag);
        System.out.println("the end");
        System.exit(0);
    }

}


