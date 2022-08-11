import java.util.*;

public class plantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] pieceInfo = input.split("<->");
            //"{plant}<->{rarity}
            String pieceName = pieceInfo[0];
            int rarity = Integer.parseInt(pieceInfo[1]);

            List<Integer> composerAndKey = new ArrayList<>();
            composerAndKey.add(rarity);


            piecesMap.put(pieceName, composerAndKey);
        }
        String command = scanner.nextLine();
        while(!command.equals("Exhibition")){
            String currentCommand = command.split("[: -]+")[0];

            switch (currentCommand){
                case "Rate":
                    //Rate: {plant} - {rating
                    String currentPlant = command.split("[: -]+")[1];
                    int currentRating = Integer.parseInt(command.split("[: -]+")[2]);
                    if(piecesMap.containsKey(currentPlant)){
                        List<Integer> ratingList = piecesMap.get(currentPlant);
                        if(ratingList.size() == 1){
                            int counter = 1;
                            ratingList.add(currentRating);
                            ratingList.add(counter);
                            piecesMap.put(currentPlant, ratingList);
                        }else {
                            int totalRating = ratingList.get(1) + currentRating;
                            int counterFromList = ratingList.get(2) + 1;
                            ratingList.remove(1);
                            ratingList.add(1, totalRating);
                            ratingList.remove(2);
                            ratingList.add(counterFromList);

                            piecesMap.put(currentPlant,ratingList);
                        }
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    //"Update: {plant} - {new_rarity}"
                    String plant = command.split("[: -]+")[1];
                    int currentRarity = Integer.parseInt(command.split("[: -]+")[2]);
                    if(piecesMap.containsKey(plant)){
                        List<Integer> rarityList = piecesMap.get(plant);
                        rarityList.remove(0);
                        rarityList.add(0, currentRarity);

                        piecesMap.put(plant, rarityList);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    //Reset: {plant}"
                    String plantReset = command.split("[: -]+")[1];
                    if(piecesMap.containsKey(plantReset)){
                        List<Integer> plantResetList = piecesMap.get(plantReset);
                        for (int i = plantResetList.size() - 1; i >= 1; i--) {
                            //int index = i;
                            plantResetList.remove(i);
                            //index--;
                        }
                    }else {
                        System.out.println("error");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        //"Plants for the exhibition:
        //- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Integer>> entry : piecesMap.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue().get(0);
            double average = 0;
            if(entry.getValue().size() == 3){
                average = entry.getValue().get(1) * 1.0 / entry.getValue().get(2);
            }else {
                average = 0.00;
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant , rarity , average);
        }

    }
}