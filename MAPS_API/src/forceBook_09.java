import javax.swing.*;
import java.util.*;

public class forceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> forceMap = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String team = command.split(" \\| ")[0];
                String player = command.split(" \\| ")[1];
                if (!forceMap.containsKey(team)) {
                    forceMap.put(team, new ArrayList<>());
                    forceMap.get(team).add(player);
                } else {
                    List<String> currentPlayer = forceMap.get(team);
                if (!currentPlayer.contains(player)) {
                        currentPlayer.add(player);
                        forceMap.put(team, currentPlayer);
                    }
                }

            } else if (command.contains("->")) {
                String player = command.split(" \\-> ")[0];
                String team = command.split(" \\-> ")[1];
                //ako играч го има в някой отбор го махам
                forceMap.entrySet().forEach(entry -> entry.getValue().remove(player));
                //проверявам дали съществува отбора
                if (forceMap.containsKey(team)) {
                    List<String> currentPlayer = forceMap.get(team);
                    currentPlayer.add(player);
                    forceMap.put(team, currentPlayer);
                } else {
                    forceMap.put(team, new ArrayList<>());
                    forceMap.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }

            command = scanner.nextLine();
        }
        forceMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(player -> System.out.println("! " + player));
                }
                );

    }
}

