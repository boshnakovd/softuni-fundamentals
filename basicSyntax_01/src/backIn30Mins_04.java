import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class backIn30Mins_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = parseInt(scanner.nextLine());
        int mins = parseInt(scanner.nextLine());
        int allMins = (hours * 60) + mins + 30;
        int hr = allMins / 60;
        int min = allMins % 60;
        if(hr > 23){
            hr = 0;
        }
        System.out.printf("%d:%02d", hr, min);
    }
}
