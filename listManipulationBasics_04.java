import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class listManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            List <String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            int item = 0;
            int index = 0;
            switch (command){
                case "Add":
                    item = parseInt(commandLine.get(1));
                    numList.add(item);
                    break;
                case "Remove":
                    item = parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    index = parseInt(commandLine.get(1));
                    numList.remove(index);
                    break;
                case "Insert":
                    item = parseInt(commandLine.get(1));
                    index = parseInt(commandLine.get(2));
                    numList.add(index, item);
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.print(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
