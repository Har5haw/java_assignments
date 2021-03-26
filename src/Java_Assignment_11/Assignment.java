package Java_Assignment_11;

import java.io.IOException;
import java.util.HashMap;

public class Assignment {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        ReadFile readFile = new ReadFile(fileName);

        CalculateFrequency calculateFrequency = new CalculateFrequency(readFile);

        HashMap<Character, Integer> frequency = calculateFrequency.getFrequency();

        StringBuilder finalString = new StringBuilder();

        for (Character character : frequency.keySet()){
            String stringBuilder = "Character: " +
                    character +
                    " repeated  --------->   " +
                    frequency.get(character) +
                    "\n";
            finalString.append(stringBuilder);
        }

        WriteFile writeFile = new WriteFile("result.txt");
        writeFile.write(finalString.toString());

        System.out.println("Content wrote to file result.txt");
    }
}
