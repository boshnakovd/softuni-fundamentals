import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class shootforthewin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        String banWord = "End";
        int count = 0;
        while (!input.equals(banWord)){
            int index = parseInt(input);
            if(index >= 0 && index < numbers.length){
                for (int i = 0; i < numbers.length; i++) {
                    int currentTarget = numbers[i];
                    if(i != index && numbers[i] != -1){
                        if(numbers[i] > currentTarget){
                            numbers[i] -= currentTarget;
                        } else {
                            numbers[i] += currentTarget;
                        }
                    }
                }
                numbers[index] = -1;
                count++;
            }


            input = scanner.nextLine();
        }
        System.out.println("Shot targets" + count + " -> "  + numbers);
    }
}
