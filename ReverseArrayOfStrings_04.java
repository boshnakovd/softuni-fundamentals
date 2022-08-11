import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElem = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElem;

        }
        System.out.println(String.join(" ", inputArr));
    }
}
