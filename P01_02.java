import java.util.*;



public class P01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Translate")) {

                String substring = command.split(" ")[1];
                String newWord = command.split(" ")[2];
                txt = txt.replace(substring, newWord);
                System.out.println(txt);
                continue;

            } else if (command.contains("Includes")) {
                String output = String.valueOf(txt.contains(command.split(" ")[1]));
                System.out.println(output.substring(0, 1).toUpperCase() + output.substring(1));
                continue;
            } else if (command.contains("Start")) {
                String subString = command.split(" ")[1];
                String output = String.valueOf(txt.startsWith(subString));
                System.out.println(output.substring(0, 1).toUpperCase() + output.substring(1));
                continue;
            } else if (command.contains("Lowercase")) {
                txt = txt.toLowerCase();
                System.out.println(txt);
                continue;
            } else if (command.contains("FindIndex")) {
                String character1 = command.split(" ")[1];
                char needChar = character1.charAt(0);
                int pos = 0;
                for (int i = 0; i < txt.length(); i++) {
                    if (needChar == txt.charAt(i)) {
                        pos = i;
                    }
                    System.out.println(pos);
                    continue;
                }
                if (command.contains("Remove")) {
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int count = Integer.parseInt(command.split(" ")[2]);
                    txt = new StringBuilder(txt).replace(startIndex, startIndex + count, "").toString();
                    System.out.println(txt);

                }
            }

        }
    }

    public static boolean isValidIndex(int index, StringBuilder txtBuild) {
        return index >= 0 && index <= txtBuild.length() - 1;
    }
}

