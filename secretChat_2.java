import java.util.Scanner;

public class secretChat_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder revealedMessage = new StringBuilder(concealedMessage);

        String enoughInput = "Reveal";

        String currentInput = scanner.nextLine();

        while (!currentInput.equals(enoughInput)) {
            boolean error = false;
            String[] arrayCurrentCommand = currentInput.split(":\\|:"); // There are several types of instructions, split by ":|:"
            String currentCommand = arrayCurrentCommand[0];

            switch (currentCommand) {
                case "InsertSpace": // InsertSpace:|:{index}
                    int currentIndexInsert = Integer.parseInt(arrayCurrentCommand[1]);
                    revealedMessage.insert(currentIndexInsert, " ");
                    break;
                case "Reverse": // Reverse:|:{substring}
                    String orgString = arrayCurrentCommand[1];

                    if (revealedMessage.indexOf(orgString) == -1) { // the message does not contain the given string
                        error = true;
                    } else { // the given string is found in the message
                        revealedMessage.delete(revealedMessage.indexOf(orgString), revealedMessage.indexOf(orgString) + orgString.length());
                        StringBuilder reversedString = new StringBuilder(orgString);
                        reversedString.reverse();
                        revealedMessage.append(reversedString);
                    }
                    break;
                case "ChangeAll": // ChangeAll:|:{oldString}:|:{replacementString}
                    String oldString = arrayCurrentCommand[1];
                    String replacementString = arrayCurrentCommand[2];
                    revealedMessage = new StringBuilder(revealedMessage.toString().replace(oldString, replacementString));
                    break;
                default:
                    System.out.println("Wrong Command!");
                    break;
            }

            if (error) {
                System.out.println("error");
            } else {
                System.out.println(revealedMessage);
            }
            currentInput = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s\n", revealedMessage);
    }
}
