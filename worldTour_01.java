import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class worldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);
        String input = scanner.nextLine();
        while (!input.equals("Travel")){
                String [] command = input.split("\\:");
                String currentCommand = command[0];
            if(currentCommand.contains("Add Stop")){    //Add Stop:{index}:{string}
                    int currentIndex = parseInt(input.split("\\:")[1]);
                    String currentStop = input.split("\\:")[2];
                    if(currentIndex >= 0 && currentIndex <= stops.length()-1){
                        stopsBuilder.insert(currentIndex, currentStop);
                    }
            }else if(currentCommand.contains("Remove Stop")){   //Remove Stop:{start_index}:{end_index}
                    int startIndex = parseInt(input.split("\\:")[1]);
                    int endIndex = parseInt(input.split("\\:")[2]);
                    if(startIndex >= 0 && startIndex <= stopsBuilder.length() - 1
                    && endIndex >= 0 && endIndex <= stopsBuilder.length() - 1){
                        stopsBuilder.delete(startIndex, endIndex + 1);
                    }
            } else if(currentCommand.contains("Switch")){ //"Switch:{old_string}:{new_string}":
                    String oldString = input.split("\\:")[1];
                    String newString = input.split("\\:")[2];
                    if(stopsBuilder.toString().contains(oldString)){
                        String updatedTxt = stopsBuilder.toString().replace(oldString, newString);
                        stopsBuilder = new StringBuilder(updatedTxt);
                    }
            }
            System.out.println(stopsBuilder);
            input = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
        // System.out.printf("Ready for world tour! Planned stops: %s", stopsBuilder.toString());
    }
}