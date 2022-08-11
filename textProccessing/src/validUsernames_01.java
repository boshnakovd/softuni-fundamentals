import java.util.Scanner;

public class validUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] usernames = input.split(", ");
        for (String name:
             usernames) {
            if(usernameIsValid(name)){
                System.out.println(name);
            }
        }

    }
    public static boolean usernameIsValid (String username){
        if(username.length() < 3 || username.length() > 16){
            return false;
        }

        for (char symbol:
             username.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-'){
            return false;
            }
        }
        return true;
    }
}
