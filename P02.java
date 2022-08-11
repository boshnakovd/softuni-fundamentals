import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfInputs = Integer.parseInt(scanner.nextLine());
        String regex = "(?<symbols>.*)[>](?<digits>[0-9]{3})[|](?<lowerCaseLetters>[a-z]{3})[|](?<upperCaseLetters>[A-Z]{3})[|](?<chars>[^<>]{3})[<]\\k<symbols>$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < countOfInputs; i++) {
            String inputLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(inputLine);

            if (matcher.find()) {
                String digits = matcher.group("digits");
                String lowerCaseLetters = matcher.group("lowerCaseLetters");
                String upperCaseLetters = matcher.group("upperCaseLetters");
                String chars = matcher.group("chars");
                System.out.printf("Password: %s%s%s%s%n", digits, lowerCaseLetters, upperCaseLetters, chars);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
