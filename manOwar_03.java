import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.*;

public class manOwar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> statusPirates = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> statusWarship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = parseInt(scanner.nextLine());
        int countSections = 0;
        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            if (command.contains("Fire")) {
                int index = parseInt(commandLine[1]);
                int damage = parseInt(commandLine[2]);
                if (index >= 0 && index < statusWarship.size()) {
                    int healthLeft = statusWarship.set(index, statusWarship.get(index) - damage);
                    statusWarship.set(index, healthLeft - damage);
                } else {
                    input = scanner.nextLine();
                    continue;
                }
            } else if (command.contains("Defend")) {
                int startIndex = parseInt(commandLine[1]);
                int endIndex = parseInt(commandLine[2]);
                int damage = parseInt(commandLine[3]);
                if (startIndex >= 0 && endIndex < statusPirates.size()) {
                    for (int i = startIndex; i < endIndex; i++) {
                        for (int currentEL :
                                statusPirates) {
                            if(i <= endIndex) {
                                int currentHealth = currentEL - damage;
                                statusPirates.set(i, currentHealth);
                                i++;
                            }
                        }
                    }
                } else {
                    input = scanner.nextLine();
                    continue;
                }
            } else if (command.contains("Repair")) {
                int index = parseInt(commandLine[1]);
                int healthToAdd = parseInt(commandLine[2]);
                if (index >= 0 && index < statusPirates.size()) {
                    int healthAdded = 0;
                    if (healthAdded < maxHealth) {
                        healthAdded = statusPirates.set(index, statusPirates.get(index) + healthToAdd);
                    } else {
                        healthToAdd = maxHealth;
                    }
                }
            } else if (command.contains("Status")) {

                double requiredHealth = maxHealth - (maxHealth * 0.80);
                for (int currentEl :
                        statusPirates) {
                    if (currentEl < requiredHealth) {
                        countSections++;
                    }
                }

            }
            input = scanner.nextLine();
        }
        int sumAllWarships = 0;
        int sumAllPirates = 0;
        if(countSections > 0) {
            System.out.printf("%d sections need repair.%n", countSections);
        }

            for (int element:
                 statusPirates) {
                sumAllPirates += element;
            }
            if(sumAllPirates <= 0){
                System.out.printf("You lost! The pirate ship has sunken.%n");
                return;
            } else {
                System.out.printf("Pirate ship status: %d%n", sumAllPirates);
            }


            for (int element:
                 statusWarship) {
                sumAllWarships += element;
            }
            if(sumAllWarships <= 0){
                System.out.printf("You won! The enemy ship has sunken.%n");
                return;
            } else {
            System.out.printf("Warship status: %d", sumAllWarships);
            }

    }

}

