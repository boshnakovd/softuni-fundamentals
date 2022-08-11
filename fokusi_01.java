
import java.util.Scanner;

    public class fokusi_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String spell = scanner.nextLine();
            StringBuilder spellStringBuilder = new StringBuilder(spell);
            String command = scanner.nextLine();

            while (!command.equals("Abracadabra")){

                if (command.contains("Abjuration")){
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                }

                else if (command.contains("Necromancy")){
                    spell = spell.toLowerCase();
                    System.out.println(spell);
                }

                else if (command.contains("Illusion")){
                    int index =Integer.parseInt( command.split(" ")[1]);
                    String symbol = command.split(" ")[2];

                    if (isValidIndex(index, spellStringBuilder)){
                        spell = spellStringBuilder.replace(index,index+1 ,symbol).toString();
                        System.out.println("Done!");
                    }
                    else {
                        System.out.println("The spell was too weak.");
                    }


                }
                else if (command.contains("Divination")) {
                    String subString1 = command.split(" ")[1];
                    String subString2 = command.split(" ")[2];
                    if (spell.contains(subString1)){
                        spell = spell.replace(subString1, subString2);
                        System.out.println(spell);
                    } else{
                        continue;
                    }


                }


                else if (command.contains("Alteration")){
                    String subSting = command.split(" ")[1];
                    if (spell.contains(subSting)){
                        spell = spell.replace(subSting, "");
                        System.out.println(spell);
                    }

                }

                else {
                    System.out.println("The spell did not work!");
                }
                command = scanner.nextLine();
            }
        }
        public static boolean isValidIndex(int index, StringBuilder builder) {
            return index >= 0 && index <= builder.length() - 1;
        }
    }
    /*
SwordMaster
Target Target Target
Abjuration
Necromancy
Divination sword shield
Abracadabra
*/
