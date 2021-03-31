package Java_Assignment_12;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStream implements StudentStreamInterface{

    private List<Student> students;

    public StudentStream(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public List<String> getNamesEnrolledAfterYear(int year){
        return students.stream().filter(p -> p.getYear_of_enrollment() > year).map(Student::getName).collect(Collectors.toList());
    }

    @Override
    public List<Student> getAllMaleInDepartment(String department){
        return students.stream().filter(p -> p.getGender().equals("Male") && p.getEngDepartment().equals(department)).collect(Collectors.toList());
    }

    @Override
    public Optional<Student> getYoungMaleInDepartment(String department){
        return students.stream().filter(p -> p.getEngDepartment().equals("Electronic")).max(Comparator.comparingInt(Student::getAge));
    }

    @Override
    public Optional<Student> getStudentOfHighPercentage(){
        return students.stream().max(Comparator.comparingDouble(Student::getPerTillDate));
    }

    @Override
    public Double getAverageAgeOfGender(String gender){
        return students.stream().filter(p -> p.getGender().equals(gender)).collect(Collectors.averagingInt(Student::getAge));
    }

    @Override
    public Map<String, Integer> getCountStudentsInDepartment(){
        Map<String, List<Student>> mapDepartmentStudent = students.stream().collect(Collectors.groupingBy(Student::getEngDepartment));
        Map<String, Integer> countMap = new HashMap<>();
        for (String department : mapDepartmentStudent.keySet()){
            countMap.put(department, mapDepartmentStudent.get(department).size());
        }
        return countMap;
    }

    @Override
    public Map<String, Integer> getCountGenderInDepartment(String department){
        Map<String, List<Student>> mapGenderStudent = students.stream().filter(p -> p.getEngDepartment().equals(department)).collect(Collectors.groupingBy(Student::getGender));
        Map<String, Integer> countMap = new HashMap<>();
        for (String gender : mapGenderStudent.keySet()){
            countMap.put(gender, mapGenderStudent.get(gender).size());
        }
        return  countMap;
    }

    @Override
    public Map<String, Integer> getCountAllGender(){
        Map<String, List<Student>> mapGenderStudent = students.stream().collect(Collectors.groupingBy(Student::getGender));
        Map<String, Integer> countAllGender = new HashMap<>();
        for (String gender : mapGenderStudent.keySet()){
            countAllGender.put(gender, mapGenderStudent.get(gender).size());
        }
        return countAllGender;
    }
}


