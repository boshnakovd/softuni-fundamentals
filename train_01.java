import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = parseInt(scanner.nextLine());
        int [] wagons = new int [countWagons];
        for (int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = parseInt(scanner.nextLine());
            wagons [wagon] = countPeople;
        }
        int sum = 0;
        for (int number:wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
