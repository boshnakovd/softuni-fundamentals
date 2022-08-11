import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class oscarsWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String zala = scanner.nextLine();
        int zakupeni_bileti = parseInt(scanner.nextLine());
        switch (name){
            case "A Star Is Born":
                if(zala.equals("normal")){
                    double cena_bilet = 7.50;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("A Star Is Born -> %.2f lv.", sum);
                } else if(zala.equals("luxury")){
                    double cena_bilet = 10.50;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("A Star Is Born -> %.2f lv.", sum);
                } else if(zala.equals("ultra luxury")){
                    double cena_bilet = 13.50;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("A Star Is Born -> %.2f lv.", sum);
                }
                break;
            case "Bohemian Rhapsody":
                if(zala.equals("normal")){
                    double cena_bilet = 7.35;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Bohemian Rhapsody -> %.2f lv.", sum);
                } else if(zala.equals("luxury")){
                    double cena_bilet = 9.45;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Bohemian Rhapsody -> %.2f lv.", sum);
                } else if(zala.equals("ultra luxury")){
                    double cena_bilet = 12.75;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Bohemian Rhapsody -> %.2f lv.", sum);
                }
                break;
            case "Green Book":
                if(zala.equals("normal")){
                    double cena_bilet = 8.15;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Green Book -> %.2f lv.", sum);
                } else if(zala.equals("luxury")){
                    double cena_bilet = 10.25;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Green Book -> %.2f lv.", sum);
                } else if(zala.equals("ultra luxury")){
                    double cena_bilet = 13.25;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("Green Book -> %.2f lv.", sum);
                }
                break;
            case "The Favourite":
                if(zala.equals("normal")){
                    double cena_bilet = 8.75;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("The Favourite -> %.2f lv.", sum);
                } else if(zala.equals("luxury")){
                    double cena_bilet = 11.55;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("The Favourite -> %.2f lv.", sum);
                } else if(zala.equals("ultra luxury")){
                    double cena_bilet = 13.95;
                    double sum = cena_bilet * zakupeni_bileti;
                    System.out.printf("The Favourite -> %.2f lv.", sum);
                }
                break;
            default:
                System.out.println("wrong command!");
                break;
        }
    }
}
