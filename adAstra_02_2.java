import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adAstra_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> output = new ArrayList<>();

        String input = scanner.nextLine();
        String regex = "(?<symbols>[#\\\\|])(?<itemName>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int caloriesPerDay = 2000;
        int totalCalories = 0;

        while (matcher.find()) {
            String foodName = matcher.group("itemName");
            String data = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            output.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, data, calories));

        }
        int daysWitFood = totalCalories / caloriesPerDay;

        System.out.printf("You have food to last you for: %d days!%n", daysWitFood);
        for (String info : output) {
            System.out.print(info);
        }
    }
}