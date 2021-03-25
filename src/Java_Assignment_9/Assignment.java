package Java_Assignment_9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Enter a sentence to check >>> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean satisfied = Pattern.matches("^[A-Z][A-Z,a-z,\\W*]*[^\\W]\\.$", input);
        if (satisfied) {
            System.out.println("Your sentence is satisfied");
        } else {
            System.out.println("Your sentence is not satisfied");
        }
    }
}
