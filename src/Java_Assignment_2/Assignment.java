package Java_Assignment_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(Character.isAlphabetic(ch)) {
                hashSet.add(ch);
            }
        }
        if(hashSet.size() == 26){
            System.out.println("Satisfied");
        }else{
            System.out.println("not satisfied");
        }
    }
}


//Time complexity : O(n), where n is length of input
//Space complexity : O(1)