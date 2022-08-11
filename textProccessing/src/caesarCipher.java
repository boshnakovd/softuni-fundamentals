import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= text.length() - 1; i++) {
            char symbol = text.charAt(i);
            char encryptedSymbol = (char) (symbol + 3);
            sb.append(encryptedSymbol);
        }
        System.out.println(sb);
    }
}
