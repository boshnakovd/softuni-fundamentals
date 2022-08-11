import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
                String input = scanner.nextLine();
                String banWord = "END";
                while (!input.equals(banWord)){
                    if(input.contains("add to start")){
                        for (int element:
                             numList) {
                            newList.add(0, element);
                        }
                    } else if (input.contains("remove greater than")) {
                        int value = parseInt(input);

                    }




                    input = scanner.nextLine();
                }



    }
}
