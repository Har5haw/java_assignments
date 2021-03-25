package Java_Assignment_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) throws IOException {
        File file =  new File("test1.txt");
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
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Character: ");
            stringBuilder.append(character);
            stringBuilder.append(" repeated  --------->   ");
            stringBuilder.append(frequency.get(character));
            stringBuilder.append("\n");
            fileWriter.write(stringBuilder.toString());
        }
        fileWriter.close();
    }
}
