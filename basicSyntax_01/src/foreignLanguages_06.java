import java.util.Scanner;

public class foreignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        if (country.equals("England") || country.equals("USA")){
            System.out.println("English");
        } else if (country.equals("Spain") || country.equals("Mexico") || country.equals("Argentina")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
