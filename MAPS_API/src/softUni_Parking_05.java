import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class softUni_Parking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> parkingUsers = new LinkedHashMap<>();
        int n = parseInt(scanner.nextLine());
        for (int numberCommands = 0; numberCommands < n; numberCommands++) {
            String[] commandData = scanner.nextLine().split(" ");
            String command = commandData[0];
            String username = commandData[1];
            switch (command){
                case "register":
                    String licensePlate = commandData[2];
                    if (!parkingUsers.containsKey(username)) {
                        parkingUsers.put(username, licensePlate);
                        System.out.println(username + " registered " + licensePlate + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + licensePlate);
                    }
                    break;
                case "unregister":
                    if(!parkingUsers.containsKey(username)){
                        System.out.println("ERROR: user " + username + " not found");
                    } else {
                        parkingUsers.remove(username);
                        System.out.println(username + " unregistered successfully");
                    }
                    break;
            }
        }
        parkingUsers.forEach((username, licensePlate) -> System.out.println(username + " => " + licensePlate));
    }
}
