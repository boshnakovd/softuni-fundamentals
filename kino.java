import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;
import static java.lang.Integer.parseInt;

public class kino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = parseDouble(scanner.nextLine());
        int statisti = parseInt(scanner.nextLine());
        double obleklo_za_statist = parseDouble(scanner.nextLine());
        double sumStatistiObleklo = statisti * obleklo_za_statist;
        double dekor = budget * 0.10;
        if(statisti > 150){
            sumStatistiObleklo = sumStatistiObleklo * 0.90;
        }
        double sumAll = dekor + sumStatistiObleklo;
        double diff = Math.abs(budget - sumAll);
        if(budget >= sumAll){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.%n", diff);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);
        }
    }
}
