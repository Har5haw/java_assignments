package Java_Assignment_3;

import Java_Assignment_3.Models.Host;

import java.io.IOException;
import java.util.Scanner;

public class AssignmentMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the host name to ping >>> ");
        String input = sc.nextLine();

        Host host = new Host(input);
        PingAHost pingAHost = new PingAHost(host);

        double median = pingAHost.getMedian(5);

        if (median > 0) {
            System.out.println("median is : " + median + " ms");
        }else {
            System.out.println("Something went wrong, please check the host");
        }


    }
}
