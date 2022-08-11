import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        int totalstr = 0;
        for (int position = 0; position < text.length(); position++) {
            char currentSym = text.charAt(position);
            if(currentSym == '>'){
                int attackStr = Integer.parseInt(text.charAt(position + 1) + "");
                totalstr += attackStr;
            } else if(currentSym != '>' && totalstr > 0){
                text.deleteCharAt(position);
                totalstr--;
                position--;
            }
        }
        System.out.println(text);
    }
}
