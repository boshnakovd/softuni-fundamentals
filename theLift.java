import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int[] lift = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if ((lift[i] < 4)) {
                if (people >= 4 - lift[i]) {
                    people -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += people;
                    people = 0;
                }
            }
        }
        boolean full = IntStream.range(0, lift.length).noneMatch(i -> lift[i] != 4);
        if (people == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && full) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        System.out.print(Arrays.toString(lift).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}