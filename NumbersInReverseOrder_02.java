import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = parseInt(scanner.nextLine());
            numbers [i] = number;
        }
        for (int i = numbers.length - 1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
