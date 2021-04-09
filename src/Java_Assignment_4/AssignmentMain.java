package Java_Assignment_4;

import Java_Assignment_4.Models.DatesModel;
import Java_Assignment_4.Models.OutputModel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Assignment main.
 */
public class AssignmentMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ParseException the parse exception
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        int numberOfLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< numberOfLines; i++){
            input.add(sc.nextLine());
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        List<DatesModel> datesModelList = new ArrayList<>();

        for (String inputLine : input){
            LocalDate currDateLocal = LocalDate.parse(inputLine.split(" ")[1] , dateTimeFormatter);
            LocalDate signupDate = LocalDate.parse(inputLine.split(" ")[0] , dateTimeFormatter);
            DatesModel datesModel = new DatesModel(signupDate, currDateLocal);
            datesModelList.add(datesModel);
        }

        Calculate calculate = new Calculate(datesModelList);
        List<OutputModel> outputModelList = calculate.getOutPut();
        for (OutputModel outputModel : outputModelList){
            if (outputModel == null){
                System.out.println("No range");
            }else{
                System.out.print(outputModel.getStartDate().format(dateTimeFormatter));
                System.out.print(" ");
                System.out.println(outputModel.getEndDate().format(dateTimeFormatter));
            }
        }
    }
}
