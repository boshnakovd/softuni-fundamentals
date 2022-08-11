import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furniture = new ArrayList<>();
        double sumAll = 0;
        Pattern pattern = Pattern.compile(">>(?<mebel>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        String command = scanner.nextLine();
        while(!command.equals("Purchase")){
            Matcher matcher = pattern.matcher(command);
            if(matcher.find()){
                String mebel = matcher.group("mebel") ;
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(mebel);
                double currentPrice = price * quantity;
                sumAll += currentPrice;
            }
            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(f -> System.out.println(f));
        System.out.printf("Total money spend: %.2f", sumAll);
    }
}
