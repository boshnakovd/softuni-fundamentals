import java.util.*;

public class courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> data = new LinkedHashMap<>();


        while(!command.equals("end")){
            String[] commandData = command.split(" \\: ");
            String courseName = commandData[0];
            String studentName = commandData[1];
            if(!data.containsKey(courseName)){
                data.put(courseName, new ArrayList<>());
            }
            data.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
        data.entrySet().forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }
        );
    }
}
