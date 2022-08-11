import java.util.ArrayList;
import java.util.Scanner;

public class digits_Letters_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if(Character.isDigit(symbol)){
                digits.append(symbol);
            } else if(Character.isLetter(symbol)){
                letters.append(symbol);
            } else {
                otherStr.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherStr);
    }
}
