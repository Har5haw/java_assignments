package Java_Assignment_12;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintStudents{
    public static void printAllDepartments(List<Student> students){
        Set<String> departments = students.stream().map(Student::getEngDepartment).collect(Collectors.toSet());
        for (String str : departments) {
            System.out.println(str);
        }
    }
}
