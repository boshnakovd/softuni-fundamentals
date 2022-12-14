import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.nextLine -> "51 47 32 61 21".split(" ") -> ["51", "47", "32", "61", "21"]
        String[] array = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            //ротация на масива
            //["51", "47", "32", "61", "21"]
            //1. взимаме първия елемент
            String firstElement = array[0];
            //2. местя всички елементи наляво
            //["51", "47", "32", "61", "21"] -> ["47", "32", "61", "21", "21"]
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            //3. задавам последния елемент в масива да е първия
            array[array.length - 1] = firstElement;
        }

        //отпечатваме елементите на масива
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}