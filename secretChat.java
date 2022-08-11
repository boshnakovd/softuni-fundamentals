import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine(); //heVVodar!gniV
        StringBuilder decryptMessage = new StringBuilder(message);
        String input = scanner.nextLine();

        while(!input.equals("Reveal")){
            String [] command = input.split(":\\|:");
            String currentCommand = command[0];
            if(currentCommand.contains("InsertSpace")){
                int numOfIndex = parseInt(command[1]);//:|:
                decryptMessage.insert(numOfIndex, " ");
                System.out.println(decryptMessage);
            } else if(currentCommand.contains("Reverse")){
                String currentWord = command[1];
                if(decryptMessage.indexOf(currentWord) > 0){
                    decryptMessage.delete(decryptMessage.indexOf(currentWord),
                            decryptMessage.indexOf(currentWord) + currentWord.length());
                    StringBuilder reversedMessage = new StringBuilder(currentWord);
                    reversedMessage.reverse();
                    decryptMessage.append(reversedMessage);
                    System.out.println(decryptMessage);
                } else {
                    System.out.println("error");
                }
            } else if(currentCommand.contains("ChangeAll")){
                String oldTxt = command[1];
                String newTxt = command[2];
                decryptMessage = new StringBuilder(decryptMessage.toString().replace(oldTxt, newTxt));
                System.out.println(decryptMessage);
            } else {
                System.out.println("Wrong command!");
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s\n", decryptMessage);
    }
}
