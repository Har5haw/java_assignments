package Java_Assignment_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        File file =  new File(fileName);
        Scanner sc = new Scanner(file);
        HashMap<Character, Integer> frequency = new HashMap<>();
        while (sc.hasNextLine()){
            String inputLine = sc.nextLine();
            for (Character ch : inputLine.toCharArray()){
                if(!frequency.containsKey(ch)){
                    frequency.put(ch, 1);
                }else{
                    frequency.put(ch, frequency.get(ch) + 1);
                }
            }
        }
        File newFile = new File("result.txt");
        newFile.createNewFile();
        FileWriter fileWriter = new FileWriter(newFile);
        for (Character character : frequency.keySet()){
            String stringBuilder = "Character: " +
                    character +
                    " repeated  --------->   " +
                    frequency.get(character) +
                    "\n";
            fileWriter.write(stringBuilder);
        }
        fileWriter.close();
    }
}
