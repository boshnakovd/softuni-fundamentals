import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_2_0 {

    static class Student_02 {
        String firstName;
        String lastName;
        int age;
        String city;

        Student_02() {
            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.city = null;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        public void setLastName(String lastName) {

            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCity(String city) {

            this.city = city;
        }

        public String getFirstName() {

            return this.firstName;
        }

        public String getLastName() {

            return this.lastName;
        }

        public int getAge() {

            return this.age;
        }

        public String getCity() {

            return this.city;
        }

        Student_02(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student_02> students = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] studentData = input.split(" ");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Student_02 student = new Student_02(firstName, lastName, age, city);

            int currentIndex = findIndexOfTheStudent(students,
                    student.getFirstName(),
                    student.getLastName());
            if (currentIndex != -1) {
                students.get(currentIndex).setAge(student.getAge());
                students.get(currentIndex).setCity(student.getCity());

            } else {
                students.add(student);
            }
            input = sc.nextLine();
        }
        String searchCity = sc.nextLine();

        for (Student_02 student : students) {
            if (student.getCity().equals(searchCity)) {
                System.out.print(student);
            }
        }

    }

    private static int findIndexOfTheStudent(List<Student_02> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            String firstNameFromList = students.get(i).getFirstName();
            String lastNameFromList = students.get(i).getLastName();

            if (firstNameFromList.equals(firstName) && lastNameFromList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}

