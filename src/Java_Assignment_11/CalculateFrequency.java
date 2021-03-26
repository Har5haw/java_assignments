package Java_Assignment_11;

import java.util.HashMap;
import java.util.Scanner;

public class CalculateFrequency{

    ReadFile readFile;

    public CalculateFrequency(ReadFile readFile) {
        this.readFile = readFile;
    }

    public ReadFile getReadFile() {
        return readFile;
    }

    public void setReadFile(ReadFile readFile) {
        this.readFile = readFile;
    }

    public  HashMap<Character, Integer> getFrequency(){
        HashMap<Character, Integer> frequency = new HashMap<>();
        Scanner scanner = readFile.getFileContent();
        while (scanner.hasNextLine()){
            String inputLine = scanner.nextLine();
            for (Character ch : inputLine.toCharArray()){
                if(!frequency.containsKey(ch)){
                    frequency.put(ch, 1);
                }else{
                    frequency.put(ch, frequency.get(ch) + 1);
                }
            }
        }
        return frequency;
    }

}
