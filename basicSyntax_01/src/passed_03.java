import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class passed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = parseDouble(scanner.nextLine());
        if (grade >= 3){
            System.out.printf("Passed!");
        } else {
            System.out.printf("Failed!");
        }
    }
}
