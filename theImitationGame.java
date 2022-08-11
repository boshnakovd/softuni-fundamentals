import java.util.Scanner;

public class theImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine(); // zzHe
        StringBuilder messageBuilder = new StringBuilder(message);
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            if (command.contains("Move")) {
                int numbOfLetters = Integer.parseInt(command.split("\\|")[1]);
                String lettersToMove = messageBuilder.substring(0,numbOfLetters);
                messageBuilder.delete(0,numbOfLetters);
                messageBuilder.insert(messageBuilder.length(),lettersToMove);
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                messageBuilder.insert(index  ,value);
            } else if (command.contains("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                String textToStr = messageBuilder.toString();
                String newText = textToStr.replace(substring,replacement);
                messageBuilder = new StringBuilder(newText);
            }
            command = scanner.nextLine();

        }
        System.out.printf("The decrypted message is: %s",messageBuilder);
    }
}
