package Java_Assignment_12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DriverClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("-----Print the name of all departments in the college?---------");
        Set<String> departments = students.stream().map(p -> p.getEngDepartment()).collect(Collectors.toSet());
        for(String str : departments){
            System.out.println(str);
        }

        System.out.println("-------Get the names of all students who have enrolled after 2018?--------");
        List<String> names = students.stream().filter(p -> p.getYear_of_enrollment() > 2018).map(p -> p.getName()).collect(Collectors.toList());
        for (String name : names){
            System.out.println(name);
        }


        System.out.println("--------Get the details of all male student in the computer sci department?--------------");
        List<Student> maleStudents = students.stream().filter(p -> p.getGender().equals("Male")).collect(Collectors.toList());
        for (Student student : maleStudents){
            System.out.println(student.getName());
        }

        System.out.println("-------How many male and female student are there ? -----------------");
        Map<String, List<Student> > map =  students.stream().collect(Collectors.groupingBy(p -> p.getGender()));
        System.out.println("Male: "+map.get("Male").size());
        System.out.println("Female: "+map.get("Female").size());

        System.out.println("---------What is the average age of male and female students?-----------------");


        System.out.println("-----------Get the details of highest student having highest percentage ?--------------");
        Optional<Student> highest = students.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));
        List<Student> highest1 = highest.stream().collect(Collectors.toList());
        for (Student str : highest1){
            System.out.println(str.getName()+" ---> "+str.getPerTillDate());
        }


        System.out.println("------------Count the number of students in each department?--------------------");
        Map<String, List<Student>> groupDepartment = students.stream().collect(Collectors.groupingBy(p -> p.getEngDepartment()));
        for (String dept : groupDepartment.keySet()){
            System.out.println(dept+" "+groupDepartment.get(dept).size());
        }


        System.out.println("------------Get the details of youngest male student in the Electronic department?----------");
        Optional<Student> highestAge = students.stream().filter(p -> p.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)));
        List<Student> highest1Age = highestAge.stream().collect(Collectors.toList());
        for (Student str : highest1Age){
            System.out.println(str.getName()+" ---> "+str.getAge());
        }



    }
}
