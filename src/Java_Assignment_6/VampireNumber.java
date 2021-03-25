package Java_Assignment_6;

import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber {
    public static boolean checkTwoNumbers(long number, long first, long second){
        String strNumber = Long.toString(number);
        String strFirst = Long.toString(first);
        String strSecond = Long.toString(second);
        int lenNumber = strNumber.length();
        int lenFirst = strFirst.length();
        int lenSecond = strSecond.length();
        if((strFirst.endsWith("0") && strSecond.endsWith("0")) || (lenFirst != lenNumber/2 || lenSecond != lenNumber/2)){
            return false;
        }
        char[] firstArray = strNumber.toCharArray();
        char[] secondArray = (strFirst + strSecond).toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
    public static void main(String[] args) {
        ArrayList<Long> vampireNumbers = new ArrayList<Long>();
        long i = 10;
        while (vampireNumbers.size() < 100){
            if(Long.toString(i).length() % 2 == 0){
                for (long first = 2; first <= Math.sqrt(i)+1; first++){
                    if(i % first == 0){
                        long second = i / first;
                        if (first > second) break;
                        if(checkTwoNumbers(i, first, second)){
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
