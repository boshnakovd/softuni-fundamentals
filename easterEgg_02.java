import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class easterEgg_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+\\W+\\/+(?<count>[0-9]+)\\/+");
        Matcher matcher = pattern.matcher(input);
        List<String> output = new ArrayList<>();
        while (matcher.find()) {
            String color = matcher.group("color");
            int count = Integer.parseInt(matcher.group("count"));
            output.add(String.format("You found %d %s eggs!", count, color));
        }
        for (String item:output){
            System.out.println(item);
        }
    }
}
