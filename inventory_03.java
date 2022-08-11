import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commandLine = input.split(" - ");
            String command = commandLine[0];
            switch (command) {
                case "Collect":
                    String item = commandLine[1];
                    if(!list.contains(item)) {
                        list.add(item);
                    }
                    break;
                case "Drop":
                    String itemToDrop = commandLine[1];
                    if(list.contains(itemToDrop)) {
                        list.remove(itemToDrop);
                    }
                    break;
                case "Combine Items":
                    String items = commandLine[1];
                    String [] splitted = items.split(":");
                    String oldItem = splitted[0];
                    String newItem = splitted[1];
                    if(list.contains(oldItem)){
                        list.add(list.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    String itemToRenew = commandLine[1];
                    if(list.contains(itemToRenew)) {
                        list.remove(itemToRenew);
                        list.add(itemToRenew);
                    }
                    break;
                default:
                    System.out.println("wrong command!");
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}