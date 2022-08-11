import java.util.Scanner;

public class passReset_01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enoughInput = "Done";

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String currentInput = scanner.nextLine();

        while (!currentInput.equals(enoughInput)) {
            boolean replaced = true;
            String[] arrayCurrentInput = currentInput.split(" ");
            String currentCommand = arrayCurrentInput[0];

            switch (currentCommand) {
                case "TakeOdd": // "TakeOdd" Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.
                    for (int i = 0; i < password.length(); i++) {
                        password.replace(i, i + 1, "");
                    }
                    break;
                case "Cut": // "Cut {index} {length}" Gets the substring with the given length starting from the given index from the password and removes its first occurrence
                    int indexCut = Integer.parseInt(arrayCurrentInput[1]);
                    int lengthCut = Integer.parseInt(arrayCurrentInput[2]);
                    String partToRemove = password.substring(indexCut, indexCut + lengthCut);
                    password.replace(password.indexOf(partToRemove), password.indexOf(partToRemove) + lengthCut, "");
                    break;
                case "Substitute": // "Substitute {substring} {substitute}" If the raw password contains the given substring, replaces all of its occurrences with the substitute text given
                    String partToBeReplaced = arrayCurrentInput[1];
                    String partToBeSet = arrayCurrentInput[2];

                    if (password.indexOf(partToBeReplaced) == -1) {
                        System.out.println("Nothing to replace!");
                        replaced = false;
                    } else {
                        password = new StringBuilder(password.toString().replace(partToBeReplaced, partToBeSet));
                    }
                    break;
                default:
                    System.out.println("Wrong Command!");
                    break;
            }

            if (replaced) System.out.println(password);
            currentInput = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
}