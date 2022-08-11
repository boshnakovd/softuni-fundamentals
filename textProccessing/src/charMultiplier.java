import java.util.Scanner;

public class charMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str1 = input.split("\\s+")[0];
        String str2 = input.split("\\s+")[1];
        char[] firstStr = str1.toCharArray();
        char[] secondStr = str2.toCharArray();
        int sum = 0;
        int minimumLength = Math.min(firstStr.length, secondStr.length);
        int maxLength = Math.max(firstStr.length, secondStr.length);
        for (int i = 0; i < minimumLength; i++) {
            sum += firstStr[i] * secondStr[i];
        }
        if(maxLength == firstStr.length){
            for (int i = minimumLength; i < maxLength; i++) {
                sum += firstStr[i];
            }
        } else {
            for (int i = minimumLength; i < maxLength; i++) {
                sum += secondStr[i];
            }
        }
        System.out.println(sum);
    }
}
