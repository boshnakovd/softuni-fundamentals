import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sizeOfASide = Double.parseDouble(input.nextLine());
        double area = sizeOfASide * sizeOfASide * 6;
        int sheetsOfPaper = Integer.parseInt(input.nextLine());
        double sumOfAreas = 0;
        for (int i = 1; i <= sheetsOfPaper; i++) {
            double lengthOfSheet = Double.parseDouble(input.nextLine());
            double widthOfSheet = Double.parseDouble(input.nextLine());
            if (i % 5 == 0) {
                continue;
            } else if (i % 3 == 0) {
                double tempArea = lengthOfSheet * widthOfSheet;
                tempArea -= 0.25 * tempArea;
                sumOfAreas += tempArea;
            } else {
                double tempArea = lengthOfSheet * widthOfSheet;
                sumOfAreas += tempArea;
            }
        }
        if (sumOfAreas >= area) {
            if (sumOfAreas == 0 && area == 0) {
                System.out.println("You've covered the gift box!\n0.00% wrap paper left.");
            } else {
                double percentage = (sumOfAreas - area) / sumOfAreas * 100;
                System.out.printf("You've covered the gift box!\n%.2f%% wrap paper left.", percentage);
            }
        } else {
            double percentage = sumOfAreas / area * 100;
            System.out.printf("You are out of paper!\n%.2f%% of the box is not covered.", Math.abs(100 - percentage));
        }
    }
}