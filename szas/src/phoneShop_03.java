import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class phoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] array = command.split(" - ");
            String input = array[0];
            if (input.contains("Add")) {
                String phone = array[1];
                if (elements.contains(phone)) {

                } else {
                    elements.add(phone);
                }
            } else if (input.contains("Remove")) {

                String phone = array[1];
                if (elements.contains(phone)) {
                    elements.remove(phone);
                }
            } else if (input.contains("Bonus phone")) {
                String phone = array[1];
                String[] arr = phone.split(":");
                String index = arr[0];
                String index1 = arr[1];
                if (elements.contains(index)) {
                    int element = elements.indexOf(index);
                    elements.add(element+1, index1);

                }

            } else if (input.contains("Last")) {
                String phone = array[1];
                if (elements.contains(phone)) {
                    elements.remove(String.valueOf(phone));
                    elements.add(phone);

                }
            }
            command = scanner.nextLine();
        }


        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i));
            if (i != elements.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
