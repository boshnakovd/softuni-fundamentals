import java.util.*;
public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> data = new LinkedHashMap<>();
        List<String> wordsList = new ArrayList<>();
        for (int countSplits = 0; countSplits < 3; countSplits++) {
            String input = scanner.nextLine();
            if(countSplits == 0){
                String[] inputLine = input.split(" \\| ");

                for (String currentWord:
                        inputLine) {
                    String[] command = currentWord.split(": ");
                    String word = command[0];
                    String definition = command[1];
                    if(data.containsKey(word)){
                        data.get(word).add(definition);
                    } else {
                        data.put(word, new ArrayList<>());
                        data.get(word).add(definition);
                    }
                }

            } else if (countSplits == 1){
                for (String line:
                        input.split(" \\| ")) {
                    wordsList.add(line);
                }

            } else if  (countSplits == 2){
                if(input.equals("Test")){
                    for (String currentWord:
                            wordsList) {
                        if(data.containsKey(currentWord)){
                            System.out.printf("%s:%n", currentWord);
                            for (String meanings: data.get(currentWord)) {
                                System.out.printf(" -%s%n", meanings);
                            }
                        }
                    }
                }

                if(input.equals("Hand Over")){
                    var ref = new Object() {
                       String output = "";
                   };

                    data.forEach((key, value) -> {
                                System.out.print(key + " ");
                            }
                    );

                }
            }
        }
    }
}

