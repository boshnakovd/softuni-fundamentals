import java.util.Random;
import java.util.Scanner;

class message_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            int randomPhrase = rnd.nextInt(phrase.length);
            int randomEvent = rnd.nextInt(event.length);
            int randomAuthor = rnd.nextInt(author.length);
            int randomCity = rnd.nextInt(city.length);

            System.out.println(String.join(" ", phrase[randomPhrase] + " " + event[randomEvent]
                    + " " + author[randomAuthor] + " - " + city[randomCity]));
        }
    }
}
