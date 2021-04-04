package Java_Assignment_9;

import Java_Assignment_9.Models.IsSentenceRegexModel;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        System.out.print("Enter a sentence to check >>> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        IsSentenceRegexModel isSentenceRegexModel = new IsSentenceRegexModel(input);
        IsSentence isSentence = new IsSentence(isSentenceRegexModel);

        if (isSentence.check()) {
            System.out.println("Your sentence is satisfied");
        } else {
            System.out.println("Your sentence is not satisfied");
        }
    }
}
