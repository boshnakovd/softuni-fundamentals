import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringRep_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int lenght = currentWord.length();
            String rep = repeatWord(currentWord, lenght);
            repeatList.add(rep);
        }
        System.out.println(String.join("", repeatList));

    }
    public static String repeatWord(String s, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }
}
