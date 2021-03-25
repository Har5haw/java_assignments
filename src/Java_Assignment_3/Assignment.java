package Java_Assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment {
    public static void main(String args[]) throws IOException, InterruptedException {
        String inputLine;
        Process process;
        int numberOfPings;

        ArrayList<Double> timeList = new ArrayList<Double>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the host name to ping >>> ");
        String host = sc.nextLine();

        System.out.print("Enter number of pings to be made >>> ");
        numberOfPings = sc.nextInt();

        process = Runtime.getRuntime().exec("ping -c"+numberOfPings+" "+host);
        BufferedReader br = new BufferedReader (new InputStreamReader(process.getInputStream()));

        while ((inputLine = br.readLine()) != null) {
            int index = inputLine.indexOf("time=");
            if(index != -1) {
                String subString = inputLine.substring(index + 5);
                String time = subString.split(" ")[0];
                timeList.add(Double.parseDouble(time));
            }
        }

        process.waitFor();

        process.destroy();

        if(process.exitValue() == 0) {
            Collections.sort(timeList);

            double median;
            int midIndex = timeList.size() / 2;

            if (timeList.size() % 2 == 0) {
                median = (timeList.get(midIndex) + timeList.get(midIndex + 1)) / 2;
            } else {
                median = timeList.get(midIndex);
            }

            System.out.println("median is : " + median + " ms");
        }else{
            System.out.println("Something went wrong, please check the host");
        }
    }
}
