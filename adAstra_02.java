import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class adAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String regex = "(?<symbols>[#\\\\|])(?<products>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);
        int days = 0;
        int sumCalories = 0;
        int caloriesNeededPerDay = 2000;
        List<String> data = new ArrayList<>();

        while (matcher.find()){
            String products = matcher.group("products");
            String date = matcher.group("date");
            int calories = parseInt(matcher.group("calories"));
            sumCalories += calories;
            data.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", products, date, calories));

        }
            days = sumCalories / caloriesNeededPerDay; //4700/2000
            System.out.printf("You have food to last you for: %d days!%n", days);

        for (String info:
             data) {
            System.out.printf(info);
        }
    }
}
