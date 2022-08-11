import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class theatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfTheDay = scanner.nextLine();
        int age = parseInt(scanner.nextLine());
        int price = 0;
        boolean isNotValid = false;
        if (age >= 0 && age <= 18){
            if (typeOfTheDay.equals("Weekday")){
                price = 12;

            } else if (typeOfTheDay.equals("Weekend")){
                price = 15;

            } else if (typeOfTheDay.equals("Holiday")){
                price = 5;

            }

        } else if (age > 18 && age <= 64){
            if (typeOfTheDay.equals("Weekday")){
                price = 18;

            } else if (typeOfTheDay.equals("Weekend")){
                price = 20;

            } else if (typeOfTheDay.equals("Holiday")){
                price = 12;

            }
        } else if (age > 64 && age <= 122){
            if (typeOfTheDay.equals("Weekday")){
                price = 12;

            } else if (typeOfTheDay.equals("Weekend")){
                price = 15;

            } else if (typeOfTheDay.equals("Holiday")){
                price = 10;

            }
        } else {
            isNotValid = true;
        } if (isNotValid){
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
