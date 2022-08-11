import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class V11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        int s = parseInt(scanner.nextLine());
        if (s > 10) {
            System.out.printf("%d X %d = %d%n", n, s, n * s);
        } else {
            for (int i = s; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }

    }
}
