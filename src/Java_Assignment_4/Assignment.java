package Java_Assignment_4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        int numberOfLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< numberOfLines; i++){
            input.add(sc.nextLine());
        }

        for (String line : input){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
            LocalDate currDateLocal = LocalDate.parse(line.split(" ")[1] , dateTimeFormatter);
            LocalDate date0 = LocalDate.parse(line.split(" ")[0] , dateTimeFormatter);
            LocalDate date1 = date0.minusDays(30);
            LocalDate date2 = date0.plusDays(30);

            if (date1.compareTo(currDateLocal) < 0){
                while (date1.plusYears(1).compareTo(currDateLocal) < 0) {
                    date0 = date0.plusYears(1);
                    date1 = date0.minusDays(30);
                    date2 = date0.plusDays(30);
                }

                if(date1.compareTo(currDateLocal) < 0 && date2.compareTo(currDateLocal) > 0){
                    date2 = currDateLocal;
                }

                System.out.print(date1.format(dateTimeFormatter));
                System.out.print(" ");
                System.out.println(date2.format(dateTimeFormatter));
            }else{
                System.out.println("No range");
            }
        }
    }
}
