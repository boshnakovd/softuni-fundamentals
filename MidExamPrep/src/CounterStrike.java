import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int won = 0;
        while(!command.equals("End of battle")){
            int distance = parseInt(command);

            if(energy < distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", won, Math.abs(energy));
                return;
            }
            energy = energy - distance;
            won++;

            if(won % 3 == 0){
                energy += won;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", won, energy);
    }
}
