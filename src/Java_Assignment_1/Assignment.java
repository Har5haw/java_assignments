package Java_Assignment_1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Assignment {
    public static void main(String[] args) {
        //Declaring useful variables
        int checkedDirectories = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter exit to quit the program!");
        while (true) {
            //Taking input for regex expression
            System.out.print("Enter a regex expression >>>  ");
            String pattern = sc.nextLine();

            //Exit if user enters "exit"
            if (pattern.equals("exit")){
                break;
            }

            //Fetching the Files from home directory
            File patternDirectory = new File("/home/harvrg");
            File[] files = patternDirectory.listFiles();

            //Declaring stack for adding all the directories nested in the home directory
            Stack<String> stack = new Stack<>();
            ArrayList<File> finalFiles = new ArrayList<>();

            //Iterating through all file, if it is directory add it to the stack and neglect the directories which starts with .
            for (File file : files) {
                if (file.isDirectory() && file.getName().charAt(0) != '.') {
                    stack.push(file.getAbsolutePath());
                    checkedDirectories++;
                } else {
                    if (Pattern.matches(pattern, file.getName())) {
                        finalFiles.add(file);
                    }
                }
            }

            //Iterate through all directories added to stack until stack becomes empty and check file name matches pattern
            while (!stack.isEmpty()) {
                String path = stack.pop();
                System.out.println("checking : " + path + "\r");
                File directory = new File(path);
                File[] filesInPath = directory.listFiles();
                for (File file : filesInPath) {
                    if (file.isDirectory() && file.getName().charAt(0) != '.') {
                        stack.push(file.getAbsolutePath());
                        checkedDirectories++;
                    } else {
                        if (Pattern.matches(pattern, file.getName())) {
                            finalFiles.add(file);
                        }
                    }
                }
            }

            //Printing the result
            System.out.println();
            System.out.println("-------- found " + finalFiles.size() + " files ---------------");
            for (File file : finalFiles) {
                System.out.println(file.getName());
            }
            System.out.println();
            System.out.println("checked directories : " + checkedDirectories);
        }
    }
}
