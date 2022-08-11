import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        List<String> racers = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        Map<String, Integer> data = new LinkedHashMap<>();
        racers.forEach(name -> data.put(name, 0));
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matchLetters = patternLetters.matcher(input);
            while(matchLetters.find()){
                nameBuilder.append(matchLetters.group());
            }
            int distance = 0;
            Matcher matchDigits = patternDigits.matcher(input);
            while (matchDigits.find()){
                distance += parseInt(matchDigits.group());
            }
            String racerName = nameBuilder.toString();
            if(data.containsKey(racerName)){
                int currentDistance = data.get(racerName);
                data.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        List<String>nameOfFirstThree = data.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
