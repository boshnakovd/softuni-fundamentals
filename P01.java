import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder txtBuilder = new StringBuilder(txt);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            if (command.contains("Translate")) { //◦ "Translate {char} {replacement}"
                String subString = commandLine[1];
                String subString2 = commandLine[2];
                if (txtBuilder.toString().contains(subString)) {
                    StringBuilder replace = new StringBuilder(txtBuilder.toString().replace(subString, subString2));
                    System.out.println(replace);
                } else if (command.contains("Includes")) {//◦ "Includes {substring}"
                    String substring = String.valueOf(txt.contains(command.split(" ")[1]));
                    System.out.println(substring.substring(0,1).toUpperCase()+substring.substring(1));
                    continue;

                } else if (command.contains("Start")) { //◦ "Start {substring}"

                } else if (command.contains("Lowercase")) { //◦ "Lowercase"
                    String newTxt = txtBuilder.toString().toLowerCase();
                    txtBuilder.replace(0, txtBuilder.length() - 1, newTxt);
                    System.out.println(txtBuilder);
                } else if (command.contains("FindIndex")) { //◦ "FindIndex {char}"
                    String symbol = commandLine[1];
                    char[] symbols = txtBuilder.toString().toCharArray();
                } else if (command.contains("Remove")) { //◦ "Remove {startIndex} {count}"
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int count = Integer.parseInt(command.split(" ")[2]);

                    txt = new StringBuilder(txt).replace(startIndex, startIndex+count, "").toString();
                    System.out.println(txt);
                }
            }
            input = scanner.nextLine();
        }
    }
    public static boolean isValidIndex(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;
    }

}

  //  public static boolean isValidIndex(int index, StringBuilder stringBuilder){
       // return index >= 0 && index <= stringBuilder.length() - 1;
   // }

