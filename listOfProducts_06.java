import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class listOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        List<String> newProductList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            newProductList.add(product);
        }
        Collections.sort(newProductList);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n", i + 1, newProductList.get(i));
        }
    }
}
