import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cardDeck = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> newDeck = new ArrayList<>();
        String input = scanner.nextLine();
        String banWord = "Ready";
        while (!input.contains(banWord)){
            String [] commandLine = input.split(" ");
            String command = commandLine[0];
            String currentCard = commandLine[1];
            switch (command){
                case"Add":
                    if(cardDeck.contains(currentCard)){
                        newDeck.add(currentCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case"Insert":
                    int index = parseInt(commandLine[2]);
                    if(cardDeck.contains(currentCard) && index >= 0 && index < newDeck.size()){
                            newDeck.add(index, currentCard);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case"Remove":
                    if(newDeck.contains(currentCard)){
                        newDeck.remove(currentCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case"Swap":
                    String cardName2 = commandLine[2];
                    int card1 = newDeck.indexOf(currentCard);
                    int card2 = newDeck.indexOf(cardName2);
                    newDeck.set(card1, cardName2);
                    newDeck.set(card2, currentCard);
                    break;
                case"Shuffle":
                    Collections.reverse(newDeck);
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", newDeck));
    }
}
