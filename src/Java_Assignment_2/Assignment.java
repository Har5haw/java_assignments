package Java_Assignment_2;

import Java_Assignment_2.Models.AllAlphabetModel;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        AllAlphabetModel allAlphabetModel = new AllAlphabetModel(input);
        AllAlphabets allAlphabets = new AllAlphabets(allAlphabetModel);

        if (allAlphabets.check()){
            System.out.println("Satisfied");
        }else{
            System.out.println("Not Satisfied");
        }
    }
}


//Time complexity : O(n), where n is length of input
//Space complexity : O(1)