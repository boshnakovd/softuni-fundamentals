import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class blackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = parseInt(scanner.nextLine());
        int dailyPlunder = parseInt(scanner.nextLine());
        double expectedPlunder = parseDouble(scanner.nextLine());
        double gatheredPlunder = 0;
        for (int i = 1; i <= days; i++) {
            gatheredPlunder += dailyPlunder;
            if(i % 3 == 0){
                gatheredPlunder = gatheredPlunder + dailyPlunder * 0.5;
            } if(i % 5 == 0){
                gatheredPlunder = gatheredPlunder * 0.70;
            }
        }
        if(gatheredPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", gatheredPlunder);
        } else {
            double percentagePlunder = (gatheredPlunder/expectedPlunder * 100);
            System.out.printf("Collected only %.2f%% of the plunder.", percentagePlunder);
        }
    }
}