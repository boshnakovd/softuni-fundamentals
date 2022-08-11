import java.util.*;

import static java.lang.Integer.parseInt;

public class minerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();
        while(!resource.equals("stop")){
           int quantity = parseInt(scanner.nextLine());
            if(!resourcesMap.containsKey(resource)){
            resourcesMap.put(resource, quantity);
            } else {
                resourcesMap.put(resource, resourcesMap.get(resource) + quantity);
            }
           resource = scanner.nextLine();
        }
        resourcesMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
