
import java.util.*;
import java.util.stream.Collectors;


public class numbersArr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        double sumAllNums = 0;
        for (int i = 0; i < numsList.size(); i++) {
                sumAllNums += numsList.get(i);
        }
        double avgNumber = sumAllNums / numsList.size();
        List<Integer> pogolqmotavg = new ArrayList<>();
        for (int currentNum:
             numsList) {
            if(currentNum > avgNumber){
                pogolqmotavg.add(currentNum);
                Collections.sort(pogolqmotavg);
                Collections.reverse(pogolqmotavg);
            }
        }
        if(pogolqmotavg.size() > 5) {
            for (int i = pogolqmotavg.size() - 1; i >= 5; i--) {
                pogolqmotavg.remove(i);
            }
        }
        if(Math.abs(sumAllNums) <= Math.abs(avgNumber)){
            System.out.println("No");
        }
        System.out.println(pogolqmotavg.toString().replaceAll("[\\[\\],]", ""));
    }
}
