import java.util.Scanner;

public class cookingMasterclass_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int minusFlour = students / 5;

        int studentsAprons = (int)Math.ceil(students + (students * 0.2));

        double price = (flourPrice * (students - minusFlour)) + ((eggPrice * 10) * students) + apronPrice * studentsAprons;

        if (budget >= price) {
            System.out.printf("Items purchased for %.2f$.", price);
        }
        else {
            System.out.printf("%.2f$ more needed.", price - budget);
        }

    }
}
