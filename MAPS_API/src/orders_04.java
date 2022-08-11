import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import com.sun.security.jgss.GSSUtil;


public class orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> mapProductsPrice = new LinkedHashMap<>();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();
        while(!input.equals("buy")){
            String product = input.split(" ")[0];
            double priceProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
                mapProductsPrice.put(product, priceProduct);
                if(!mapQuantity.containsKey(product)){
                    mapQuantity.put(product, quantity);
                } else {
                    int currentValue =  mapQuantity.get(product);
                    mapQuantity.put(product, currentValue + quantity);
                }
                input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : mapProductsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * mapQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
