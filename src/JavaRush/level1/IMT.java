package JavaRush.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Индекс массы тела
*/

public class IMT {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index = weight / (height * height);
            if (index < 18.5) {
                System.out.println("Недовес: меньше, чем 18.5");
            }
            if (18.5 <= index && index < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (25 <= index && index < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (index >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}


