import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class guineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //    • On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0]
        //    • On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0]
        double quantityFoodInGr = parseDouble(scanner.nextLine()) * 1000;
        double quantityHayInGr = parseDouble(scanner.nextLine()) * 1000;
        double quantityCoverInGr = parseDouble(scanner.nextLine()) * 1000;
        double guineaKG = parseDouble(scanner.nextLine()) * 1000;
        int day = 1;
        while (day <= 30){
            quantityFoodInGr = quantityFoodInGr - 300;
            if(day % 2 == 0){
                quantityHayInGr = (quantityFoodInGr * 5) / 100;
            } else if(day % 3 == 0){
                quantityCoverInGr = guineaKG * 0.3333;
            }
            day++;
        }
        double foodInKG = quantityFoodInGr / 1000;
        double hayInKg = quantityHayInGr / 1000;
        double coverInKg = quantityCoverInGr / 1000;
        if(foodInKG > 0 && hayInKg > 0 && coverInKg > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n", foodInKG, hayInKg, coverInKg);
        } else {
            System.out.printf("Merry must go to the pet store!");
        }

    }
}
