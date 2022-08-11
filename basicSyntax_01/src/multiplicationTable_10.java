import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class multiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n*i);
        }
    }
}
