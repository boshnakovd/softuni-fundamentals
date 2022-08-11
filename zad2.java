import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\|")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        String banWord = "Game over";
        int countMyPoints = 0;
        while (!input.equals(banWord)) {
            String[] commandLine = input.split("@");
            String command = commandLine[0];
            int startIndex = parseInt(commandLine[1]);
            int length = parseInt(commandLine[2]);
            if (command.contains("Shoot Left")) {
                if (startIndex >= 0 && length < numbers.length) {
                        int element = numbers[startIndex];
                        for (int j = startIndex; j < length; j++) {
                            numbers[j] = element - 5;
                            countMyPoints += 5;
                        }
                }
            } else if (command.contains("Shoot Right")) {
                if(startIndex < numbers.length && length >= 0){
                    int element = numbers[startIndex];
                    for (int i = startIndex; i > length; i--) {
                        numbers[i] = element - 5;
                    }
                }
            }

            input = scanner.nextLine();
        }




        }
    }

