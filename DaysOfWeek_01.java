import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DaysOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = parseInt(scanner.nextLine());
        if(n >= 1 && n <= 7){
            System.out.println(dayOfWeek[n-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
