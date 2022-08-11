import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            String input = scanner.nextLine();

            String regex = "@[#]+[A-Z][A-Za-z0-9]{4,}[A-Z]@[#]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder digits = new StringBuilder();
            boolean isTrue = false;

            if (matcher.find()) {
                String regexDigit = "[0-9]";
                Pattern patternDigit = Pattern.compile(regexDigit);
                Matcher matcherDigit = patternDigit.matcher(input);
                while (matcherDigit.find()) {
                    String digit = matcherDigit.group();
                    digits.append(digit);
                    isTrue = true;
                }
                if (isTrue){
                    System.out.printf("Product group: %s%n",digits);
                } else {
                    System.out.println("Product group: 00");
                }

            } else {
                System.out.println("Invalid barcode");
            }




        }

    }
}