import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class friendsList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());
        String inputLine = scanner.nextLine();
        int blackListed = 0;
        int lostNames = 0;
        while (!inputLine.equals("Report")) {
            String[] commands = inputLine.split(" ");
            String command = commands[0];
            switch (command) {
                case "Blacklist":
                    String nickname = commands[1];
                    if (namesList.contains(nickname)) {
                        blackListed++;
                        System.out.printf("%n%s was blacklisted.%n", nickname);
                        int index = namesList.indexOf(nickname);
                        nickname ="Blacklisted";
                        namesList.set(index, nickname);
                    } else {
                        System.out.printf("%s was not found.%n", nickname);
                    }
                    break;
                    case "Error":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < namesList.size()) {
                        String wrongName = String.valueOf(namesList.get(index));
                        if (!wrongName.equals("Blacklisted") && !wrongName.equals("Lost")) {
                            lostNames++;
                            System.out.printf("%s was lost due to an error.%n",wrongName);
                            wrongName = "Lost";
                            namesList.set(index,wrongName);
                        }
                    }
                    break;
                case "Change":
                    int changedIndex = Integer.parseInt(commands[1]);
                    String createNewName = commands[2];
                    if (changedIndex >= 0 && changedIndex < namesList.size()) {
                        String currentName = String.valueOf(namesList.get(changedIndex));
                        System.out.printf("%s changed his username to %s.%n", currentName, createNewName);
                        namesList.set(changedIndex, createNewName);
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blackListed);
        System.out.printf("Lost names: %d%n", lostNames);
        System.out.println(String.join(" ", namesList));
    }
}
