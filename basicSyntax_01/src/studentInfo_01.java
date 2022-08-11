import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class studentInfo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = parseDouble(scanner.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
        System.out.println(result);

    }
}
