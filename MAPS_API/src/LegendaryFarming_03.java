import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();
        boolean isWin = false;
        while(!isWin){
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");
        for (int index = 0; index <= inputData.length - 1; index+=2) {
            int quantity = Integer.parseInt(inputData[index]);
            String material = inputData[index + 1].toLowerCase();
            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                int currentQ = items.get(material);
                items.put(material, currentQ + quantity);
            } else {
                if (!junks.containsKey(material)) {
                    junks.put(material, quantity);
                } else {
                    int currentJunks = junks.get(material);
                    junks.put(material, currentJunks + quantity);
                }
            }
            if(items.get("shards") >= 250){
                System.out.println("Shadowmourne obtained!");
                items.put("shards", items.get("shards") - 250);
                isWin = true;
                break;
            } else if (items.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                items.put("fragments", items.get("fragments") - 250);
                isWin = true;
                break;
            } else if(items.get("motes") >= 250){
                System.out.println("Dragonwrath obtained!");
                items.put("motes", items.get("motes") - 250);
                isWin = true;
                break;
            }

        }

            if(isWin){
                break;
            }

    }
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
