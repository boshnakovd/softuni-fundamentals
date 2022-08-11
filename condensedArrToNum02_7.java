import java.util.Arrays;
import java.util.Scanner;

public class condensedArrToNum02_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        while (numbersArray.length > 1){
            int[] condensed = new int[numbersArray.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbersArray[i] + numbersArray[i + 1];
            }
            numbersArray = condensed;
        }
        System.out.println(numbersArray[0]);
    }
}
