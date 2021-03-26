package Java_Assignment_12;

import java.util.*;

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

        StudentStream studentStream = new StudentStream(students);

        System.out.println("------------------Print the name of all departments in the college?----------------------");
        PrintStudents.printAllDepartments(students);


        System.out.println("----------------Get the names of all students who have enrolled after 2018?--------------");
        List<String> names = studentStream.getNamesEnrolledAfterYear(2018);
        System.out.println(names);


        System.out.println("--------Get the details of all male student in the computer sci department?--------------");
        List<Student> maleStudents = studentStream.getAllMaleInDepartment("Computer Science");
        System.out.println(maleStudents);


        System.out.println("------------------How many male and female student are there ? --------------------------");
        Map<String, Integer> countAllGender = studentStream.getCountAllGender();
        System.out.println("Male: " + countAllGender.get("Male") +"\n" + "Female: " + countAllGender.get("Female"));


        System.out.println("-------------------What is the average age of male and female students?------------------");
        Double averageMaleAge = studentStream.getAverageAgeOfGender("Male");
        Double averageFemaleAge = studentStream.getAverageAgeOfGender("Female");
        System.out.println("Average age of male: "+averageMaleAge+"\n"+"Average age of female: "+averageFemaleAge);


        System.out.println("-----------Get the details of highest student having highest percentage ?----------------");
        Optional<Student> highest = studentStream.getStudentOfHighPercentage();
        if(highest.isPresent()){
            Student str = highest.get();
            System.out.println(str.getName() + " ---> " + str.getPerTillDate());
        }


        System.out.println("-----------------Count the number of students in each department?------------------------");
        Map<String, Integer> countStudentsInDept = studentStream.getCountStudentsInDepartment();
        for (String dept : countStudentsInDept.keySet()) {
            System.out.println(dept + " " + countStudentsInDept.get(dept));
        }


        System.out.println("---------Get the details of youngest male student in the Electronic department?----------");
        Optional<Student> highestAge = studentStream.getYoungMaleInDepartment("Electronic");
        if (highestAge.isPresent()){
            Student str1 = highestAge.get();
            System.out.println(str1.getName() + " ---> " + str1.getAge());
        }


        System.out.println("-----How many male and female students are there in the computer science department?-an----");
        Map<String, Integer> countGender = studentStream.getCountGenderInDepartment("Computer Science");
        System.out.println("Male: " + countGender.get("Male")+"\n"+"Female: " + countGender.get("Female"));
    }
}
