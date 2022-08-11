import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStuds = parseInt(scanner.nextLine());
        int numLectures = parseInt(scanner.nextLine());
        int additionalBonus = parseInt(scanner.nextLine());
        int studentWithMaxAttendance = 0;
        double maxBonusForStud = 0;
        double totalBonusForStud = 0;
        for (int i = 1; i < numStuds ; i++) {
            int numOfAttendances = parseInt(scanner.nextLine());
            maxBonusForStud = Math.ceil(numOfAttendances * 1.0 / numLectures  * 5 + additionalBonus);
            if(numOfAttendances > studentWithMaxAttendance){
                studentWithMaxAttendance = numOfAttendances;
            }
            if(maxBonusForStud > totalBonusForStud){
                totalBonusForStud = maxBonusForStud;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonusForStud);
        System.out.printf("The student has attended %d lectures.", studentWithMaxAttendance);
    }
}