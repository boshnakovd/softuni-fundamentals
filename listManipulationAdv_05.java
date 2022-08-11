import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdv_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Contains":
                    int elementToContains = Integer.parseInt(actions.get(1));

                    if (numberList.contains(elementToContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondAction = actions.get(1);
                    if (secondAction.equals("even")) {
                        List<Integer> evenElements = getEvenNumbers(numberList);
                        System.out.println(evenElements.toString().replace("[", "").replace("]", "").replace(",", ""));
                    } else {
                        List<Integer> oddElements = getOddNumbers(numberList);
                        System.out.println(oddElements.toString().replace("[", "").replace("]", "").replace(",", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numberList.size(); i++) {
                        sum += numberList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = actions.get(1);
                    int number = Integer.parseInt(actions.get(2));
                    List<Integer> conditionalNumbersList = getConditionNumbers(numberList, condition, number);
                    System.out.println(conditionalNumbersList.toString().replace("[", "").replace("]", "").replace(",", ""));
                    break;

            }
            input = sc.nextLine();
        }
        System.out.println();
    }

    public static List<Integer> getOddNumbers(List<Integer> initList) {
        List<Integer> listOfOddNumbers = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (currentElement % 2 == 1) {
                listOfOddNumbers.add(currentElement);
            }
        }
        return listOfOddNumbers;
    }

    public static List<Integer> getEvenNumbers(List<Integer> initList) {
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (currentElement % 2 == 0) {
                listOfEvenNumbers.add(currentElement);
            }
        }
        return listOfEvenNumbers;
    }
    public static List<Integer> getConditionNumbers(List<Integer> initList, String condition, int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentElement = initList.get(i);

            if (condition.equals("<")) {
                if (currentElement < number) {
                    result.add(currentElement);
                }
            } else if (condition.equals("<=")) {
                if (currentElement <= number) {
                    result.add(currentElement);
                }
            } else if (condition.equals(">")) {
                if (currentElement > number) {
                    result.add(currentElement);
                }
            } else if (condition.equals(">=")) {
                if (currentElement >= number) {
                    result.add(currentElement);
                }
            }
        }
        return result;
    }
}
