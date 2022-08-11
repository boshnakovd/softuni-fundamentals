import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class addAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = parseInt(scanner.nextLine());
        int secondInt = parseInt(scanner.nextLine());
        int thirdInt = parseInt(scanner.nextLine());
        int result = sumOffirstTwoInts(firstInt, secondInt) - thirdInt;
        System.out.println(result);

    }
    private static int sumOffirstTwoInts(int firstInt, int secondInt){
        int sum = firstInt + secondInt;
        return sum;
    }



}
