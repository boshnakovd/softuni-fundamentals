
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> products = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        String banWord = "Go Shopping!";
        while (!input.equals(banWord)){
            String [] commandLine = input.split(" ");
            String command = commandLine[0];
            String item = commandLine[1];
            switch (command){
                case"Urgent":
                    if(!products.contains(item)){
                        products.add(0, item);
                    }
                    break;
                case"Unnecessary":
                    if(products.contains(item)){
                        products.remove(item);
                    }
                    break;
                case"Correct":
                    String newItem = commandLine[2];
                    if(products.contains(item)){
                        products.set(products.indexOf(item), newItem);
                    }
                    break;
                case"Rearrange":
                    if(products.contains(item)){
                        products.remove(item);
                        products.add(item);
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", products));
    }
}
