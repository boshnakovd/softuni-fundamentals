import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class monthPrinter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = parseInt(scanner.nextLine());
        switch (month){
            case 1:
                System.out.printf("January");
                break;
            case 2:
                System.out.printf("February");
                break;
            case 3:
                System.out.printf("March");
                break;
            case 4:
                System.out.printf("April");
                break;
            case 5:
                System.out.printf("May");
                break;
            case 6:
                System.out.printf("June");
                break;
            case 7:
                System.out.printf("July");
                break;
            case 8:
                System.out.printf("August");
                break;
            case 9:
                System.out.printf("September");
                break;
            case 10:
                System.out.printf("October");
                break;
            case 11:
                System.out.printf("November");
                break;
            case 12:
                System.out.printf("December");
                break;
            default:
                System.out.printf("Error!");
        }

        }
    }
