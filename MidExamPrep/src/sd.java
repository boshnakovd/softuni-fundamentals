package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class sd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> contacts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List <String> printListExport = new ArrayList<>();

        String [] commands = scanner.nextLine().split("\\s+");

        while (!commands[0].equals("Report")) {

            switch (commands[0]) {
                case "Blacklist":
                    String name = commands [1];
                    int index = Integer.parseInt(commands[2]);
                    if (!contacts.contains(name)) {

                        contacts.add(commands[1]);
                    } else if (0 <= index && index < contacts.size()){
                        contacts.add(index, name);
                    }

                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(commands[1]);
                    if (0 <= indexRemove && indexRemove < contacts.size()) {
                        contacts.remove(indexRemove);
                    }
                    break;
                case "Export":
                    int startIndex = Integer.parseInt(commands[1]);
                    int count = Integer.parseInt(commands[2]);
                    count += startIndex;

                    if (0<= startIndex && startIndex < contacts.size() && count > 0) {

                        if (count > contacts.size()) {
                            count = contacts.size();
                        }
                        for (int i = startIndex; i < count; i++) {
                            printListExport.add(contacts.get(i));
                        }
                        System.out.println(String.join(" ", printListExport));
                    }
                    printListExport.clear();
                    break;
                default:
            }
            commands = scanner.nextLine().split(" ");
        }

        if (commands[1].equals("Normal")) {
            Collections.sort(contacts);
            System.out.println("Contacts: " + String.join(" ", contacts));
        }
        if (commands[1].equals("Reversed")) {
            Collections.reverse(contacts);
            System.out.println("Contacts: " + String.join(" ", contacts));
        }


    }
}