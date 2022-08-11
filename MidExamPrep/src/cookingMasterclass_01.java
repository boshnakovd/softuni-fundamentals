import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class cookingMasterclass_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = parseDouble(scanner.nextLine());
        int students = parseInt(scanner.nextLine());
        double packagePriceOfFlour = parseDouble(scanner.nextLine());
        double priceForSingleEgg = parseDouble(scanner.nextLine());
        double priceForSingleApron = parseDouble(scanner.nextLine());
        int freePack = 0;
        int flours = 0;
        int apron = 0;
        int eggs = 0;
        for (int i = 1; i <= students ; i++) {
            if(students == 5){
                freePack++;
            }
            eggs = eggs + 10;
            flours++;
            apron++;

        }

       double priceEggs = eggs * priceForSingleEgg;
        double priceAprons = apron * priceForSingleApron;
        double priceFlours = (flours + Math.ceil(flours * 0.20)) * packagePriceOfFlour;
        double priceAll = priceAprons + priceFlours + priceEggs;
        double sum = Math.abs(budget - priceAll);

        if(priceAll <= budget){
            System.out.printf("Items purchased for %.2f$", sum);
        }
        }
    }

