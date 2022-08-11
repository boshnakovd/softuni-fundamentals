import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;

public class academia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double naem = parseDouble(scanner.nextLine());
        double statuetki = naem - (0.3 * naem);
        double ketaring = statuetki - (0.15 * statuetki);
        double ozvuchavane = ketaring / 2;
        double sumAll = naem + statuetki + ketaring + ozvuchavane;
        System.out.printf("%.2f", sumAll);
    }
}
