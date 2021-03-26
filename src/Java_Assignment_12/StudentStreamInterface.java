package Java_Assignment_12;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface StudentStreamInterface {
    List<String> getNamesEnrolledAfterYear(int year);
    List<Student> getAllMaleInDepartment(String department);
    Optional<Student> getYoungMaleInDepartment(String department);
    Optional<Student> getStudentOfHighPercentage();
    Double getAverageAgeOfGender(String gender);
    Map<String, Integer> getCountStudentsInDepartment();
    Map<String, Integer> getCountGenderInDepartment(String department);
    Map<String, Integer> getCountAllGender();
}
