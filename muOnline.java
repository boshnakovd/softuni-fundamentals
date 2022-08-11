import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHP = 100;
        int initialBitCoin = 0;
        boolean isDead = false;
        String [] array = scanner.nextLine().split("\\|");
        for (int i = 0; i < array.length; i++) {
            String [] room = array[i].split(" ");
            String command = room[0];

            switch (command){
                case"potion":
                    int healHP = parseInt(room[1]);
                    int diffHP = 100 - initialHP;
                    initialHP = initialHP + healHP;
                    if(initialHP > 100){
                        initialHP = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", healHP);
                    System.out.printf("Current health: %d hp.%n", initialHP);
                    break;
                case"chest":
                    int btcFound = parseInt(room[1]);
                    initialBitCoin += btcFound;
                    System.out.printf("You found %d bitcoins.%n", btcFound);
                    break;
                default:
                    int num = parseInt(room[1]);
                    initialHP = initialHP - num;
                    if(initialHP < 0){
                        isDead = true;
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                    } else {
                        System.out.printf("You slayed %s.%n", command);
                    }
                    break;
            }
            if(isDead){
                break;
            }
        }
        if(!isDead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitCoin);
            System.out.printf("Health: %d%n", initialHP);
        }
    }
}
