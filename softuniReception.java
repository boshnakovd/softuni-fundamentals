import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class softuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1PerHour = parseInt(scanner.nextLine());
        int group2PerHour = parseInt(scanner.nextLine());
        int group3PerHour = parseInt(scanner.nextLine());
        int allStuds = parseInt(scanner.nextLine());
        int needHours = 0;
        int allGroupsPerHour = group1PerHour + group2PerHour + group3PerHour;
        while(allStuds > 0){
            allStuds -= allGroupsPerHour;
            needHours++;
            if(needHours % 4 == 0){
                needHours++;
            }
        }
        System.out.printf("Time needed: %dh.", needHours);
    }
}
