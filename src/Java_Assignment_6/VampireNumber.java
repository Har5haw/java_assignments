package Java_Assignment_6;

import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber {
    public static boolean checkTwoNumbers(long number, long firstHalfNumber, long secondHalfNumber){
        String strNumber = Long.toString(number);
        String strFirstHalfNumber = Long.toString(firstHalfNumber);
        String strSecondHalfNumber = Long.toString(secondHalfNumber);
        int lenNumber = strNumber.length();
        int lenFirstHalfNumber = strFirstHalfNumber.length();
        int lenSecondHalfNumber = strSecondHalfNumber.length();
        if((strFirstHalfNumber.endsWith("0") && strSecondHalfNumber.endsWith("0")) || (lenFirstHalfNumber != lenNumber/2 || lenSecondHalfNumber != lenNumber/2)){
            return false;
        }
        char[] numberInCharArray = strNumber.toCharArray();
        char[] firstAndSecondInCharArray = (strFirstHalfNumber + strSecondHalfNumber).toCharArray();
        Arrays.sort(numberInCharArray);
        Arrays.sort(firstAndSecondInCharArray);
        return Arrays.equals(numberInCharArray, firstAndSecondInCharArray);
    }
    public static void main(String[] args) {
        ArrayList<Long> vampireNumbers = new ArrayList<>();
        long i = 10;
        while (vampireNumbers.size() < 100){
            if(Long.toString(i).length() % 2 == 0){
                for (long firstHalfNumber = 2; firstHalfNumber <= Math.sqrt(i)+1; firstHalfNumber++){
                    if(i % firstHalfNumber == 0){
                        long secondHalfNumber = i / firstHalfNumber;
                        if (firstHalfNumber > secondHalfNumber) break;
                        if(checkTwoNumbers(i, firstHalfNumber, secondHalfNumber)){
                            vampireNumbers.add(i);
                        }
                    }
                }
                i++;
            }else{
                i*=10;
            }
        }
        for (Long value : vampireNumbers){
            System.out.println(value);
        }
    }
}
