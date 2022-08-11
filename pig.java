import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class pig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //    • On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0]
        double Food = parseDouble(scanner.nextLine());
        double hay = parseDouble(scanner.nextLine());
        double cover = parseDouble(scanner.nextLine());
        double weight= parseDouble(scanner.nextLine());
        int days = 30;
        double foodingr = Food * 1000;
        double haygr = hay * 1000;
        double covergr = cover * 1000;
        double weightgr = weight * 1000;
        for (int i = 1; i <= days ; i++) {
            foodingr = foodingr - 300;
            if(i % 2 == 0){
                haygr = haygr - (foodingr * 0.05);
            }
            if(i % 3 == 0){
                covergr = covergr - (weightgr / 3);
            }

        }
        double food = foodingr / 1000;
        double hays = haygr / 1000;
        double covers = covergr / 1000;
        double weights = weightgr / 1000;
        if(foodingr > 0 && haygr > 0 && covergr > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hays, covers);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
}
