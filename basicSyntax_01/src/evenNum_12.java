import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class evenNum_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = parseInt(scanner.nextLine());
        while (true){
            if (num % 2 ==0){
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            } else {
                System.out.printf("Please write an even number.%n");
                num = parseInt(scanner.nextLine());
            }
        }

    }
}
