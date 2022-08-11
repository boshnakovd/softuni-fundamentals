import java.util.*;

import static java.lang.Integer.parseInt;

public class p1rates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> mapData = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Sail")) {
            String [] data = inputLine.split("\\|\\|");
            String town = data[0];
            int population = parseInt(data[1]);
            int goldCurrency = parseInt(data[2]);
            if (!mapData.containsKey(town)) {
                mapData.putIfAbsent(town, new ArrayList<>());
                mapData.get(town).add(0, population);
                mapData.get(town).add(1, goldCurrency);
            } else {
                int currentPop = mapData.get(town).get(0);
                int currentG = mapData.get(town).get(1);
                mapData.get(town).add(0, population + currentPop);
                mapData.get(town).add(1, goldCurrency + currentG);
            }
            inputLine = scanner.nextLine();
            }
        String events = scanner.nextLine();
        while (!events.equals("End")) {
            String commandName = events.split("=>")[0];
            switch (commandName) {
                case "Plunder": //"Plunder=>{town}=>{people}=>{gold}"
                    String town = events.split("=>")[1];
                    int people = parseInt(events.split("=>")[2]);
                    int gold = parseInt(events.split("=>")[3]);
                    int population = mapData.get(town).get(0);
                    int goldCurrency = mapData.get(town).get(1);
                    int peopleLeft = population - people;
                    int goldLeft = goldCurrency - gold;
                    mapData.get(town).set(0, peopleLeft);
                    mapData.get(town).set(1, goldLeft);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if(peopleLeft == 0 || goldLeft == 0){
                        System.out.printf("%s has been wiped off the map!%n", town);
                        mapData.remove(town);
                    }
                    break;
                case "Prosper": //"Prosper=>{town}=>{gold}"
                    String townName = events.split("=>")[1];
                    int goldToAdd = parseInt(events.split("=>")[2]);
                    if(goldToAdd < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int goldWithoutAddition = mapData.get(townName).get(1);
                        int goldNow = goldToAdd + goldWithoutAddition;
                        mapData.get(townName).set(1, goldNow);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldToAdd, townName, goldNow);
                    }
                    break;
                default:
                    System.out.println("Wrong command!");
                    break;
            }
            events = scanner.nextLine();
        }
        if(mapData.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", mapData.size());
            for (Map.Entry<String, List<Integer>> entry : mapData.entrySet()) {
                String town = entry.getKey();
                int population = entry.getValue().get(0);
                int gold = entry.getValue().get(1);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town, population, gold);
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
