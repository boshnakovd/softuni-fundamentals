import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([:]{2}|[*]{2})([A-Z][a-z]{2,})\\1";
        String regexDigit = "[0-9]";

        Pattern patternDigit = Pattern.compile(regexDigit);
        Matcher matcherDigit = patternDigit.matcher(input);

        long sum =1;
        while (matcherDigit.find()) {
            Integer find =Integer.parseInt(matcherDigit.group());
            sum = sum * find;

        }
        System.out.printf("Cool threshold: %d%n", sum);

        Pattern patternEmoji = Pattern.compile(regex);
        Matcher matcherEmoji = patternEmoji.matcher(input);

        int count = 0;

        List<String> emojiList = new ArrayList<>();

        while (matcherEmoji.find()) {
            count++;
            String emoji = matcherEmoji.group();
            String name = matcherEmoji.group(2);
            int sumSymbol = 0;
            for (int i = 0; i <name.length() ; i++) {
                char symbol = name.charAt(i);
                int ascii = (int) symbol;
                sumSymbol+= ascii;

            }

            if (sumSymbol >= sum) {

                emojiList.add(emoji);

            }

        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n",count);
        emojiList.forEach(name -> System.out.println(name));

    }
}