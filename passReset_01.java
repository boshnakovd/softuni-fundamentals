import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class passReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        StringBuilder passBuilder = new StringBuilder(password);
        String command = scanner.nextLine();
        String endCommand = "Done";
        while (!command.equals(endCommand)){
            if(command.contains("TakeOdd")){
                for (int i = 0; i < passBuilder.length(); i++) {
                    passBuilder.replace(i, i+1, "");
                }
                System.out.println(passBuilder);
            } else if(command.contains("Cut")){   //"Cut {index} {length}"
                int startIndex = parseInt(command.split(" ")[1]);
                int length = startIndex + parseInt(command.split(" ")[2]);
                passBuilder.delete(startIndex, length);
                System.out.println(passBuilder);
            } else if(command.contains("Substitute")){
                String substring = command.split(" ")[1];
                String toAdd = command.split(" ")[2];
                if(passBuilder.indexOf(substring) == -1){
                    System.out.println("Nothing to replace!");
                } else {
                    passBuilder = new StringBuilder(passBuilder.toString().replace(substring, toAdd));
                    System.out.println(passBuilder);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + passBuilder);
    }
}