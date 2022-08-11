import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class phoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        List<String> namesList = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")){
            String [] commands = inputLine.split(" ");
            String command = commands [0];
            switch (command){
                case "Add":
                    String name = commands[1];
                    if(!namesList.contains(name)){
                        int index = namesList.indexOf(name);
                        namesList.set(index, name);

                    } else {
                        return;
                    }
                case "Remove":
                    int index = parseInt(commands[1]);
                    if(namesList.contains(name)){
                        namesList.remove(name);

                    } else {
                        return;
                    }
                case "Bonus phone":

                    if(namesList.contains(name)){


                        namesList.set(index, name);
                    } else {
                        return;
                    }
                case "Last":
                    if(namesList.contains(name)){
                        namesList.add(name);
                    }else {
                        return;
                    }
            }
        }
        System.out.println(String.join(", ", namesList));
    }
}