import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class studentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        Map<String, List<Double>> studentData = new LinkedHashMap<>();
        for (int numsOfCommands = 0; numsOfCommands < n; numsOfCommands++) {
                String student = scanner.nextLine();
                Double grade = parseDouble(scanner.nextLine());
                if(!studentData.containsKey(student)){
                    studentData.put(student, new ArrayList<>());
                }
                studentData.get(student).add(grade);
            }
            Map<String, Double> studentAvgGrade = new LinkedHashMap<>();
            for(Map.Entry<String, List<Double>> entry : studentData.entrySet()){
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrades (grades);
            if(averageGrade >= 4.50){
                studentAvgGrade.put(studentName, averageGrade);
            }
        }
        studentAvgGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    private static double getAverageGrades(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }

}

