import java.util.Scanner;

public class lettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] codes = input.split("\\s+");
        double totalSum = 0;
        for (String code:
             codes) {
            double number = getModifiedNumber(code);
            totalSum += number;
        }
        System.out.printf("%.2f", totalSum);
    }
    public static double getModifiedNumber(String code){
        char firstCharacter = code.charAt(0);
        char secondCharacter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstCharacter, ' ')
                .replace(secondCharacter, ' ')
                .trim());
        if(Character.isUpperCase(firstCharacter)){
            int positionUpperLetter = (int) firstCharacter - 64;
            number /= positionUpperLetter;
        } else {
            int positionLowerLetter = (int) firstCharacter - 96;
            number *= positionLowerLetter;
        }
        if(Character.isUpperCase(secondCharacter)){
            int positionUpperLetter = (int) secondCharacter - 64;
            number -= positionUpperLetter;
        } else {
            int positionLowerLetter = (int) secondCharacter - 96;
            number += positionLowerLetter;
        }
        return number;
    }

}
