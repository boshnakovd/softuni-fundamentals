import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operationInput = scanner.nextLine();
        int firstNumInput = parseInt(scanner.nextLine());
        int secondNumInput = parseInt(scanner.nextLine());
        switch (operationInput){
            case "add":
                addNumbers(firstNumInput, secondNumInput);
                break;
            case "multiply":
                multiplyNumbers(firstNumInput, secondNumInput);
                break;
            case "substract":
                substractNumbers(firstNumInput, secondNumInput);
                break;
            case "divide":
                divideNumbers(firstNumInput, secondNumInput);
                break;
        }
    }

    public static void addNumbers (int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(result);
    }
    public static void multiplyNumbers (int firstNum, int secondNum){
        int result = firstNum  * secondNum;
        System.out.println(result);
    }
    public static void substractNumbers(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void divideNumbers(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
