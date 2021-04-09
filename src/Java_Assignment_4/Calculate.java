package Java_Assignment_4;

import Java_Assignment_4.Interfaces.CalculateInterface;
import Java_Assignment_4.Models.DatesModel;
import Java_Assignment_4.Models.OutputModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Calculate.
 */
public class Calculate implements CalculateInterface {
    /**
     * The Dates model list.
     */
    List<DatesModel> datesModelList;

    /**
     * Instantiates a new Calculate.
     *
     * @param datesModelList the dates model list from input
     */
    public Calculate(List<DatesModel> datesModelList) {
        this.datesModelList = datesModelList;
    }

    @Override
    public List<OutputModel> getOutPut(){
        List<OutputModel> output = new ArrayList<>();
        for (DatesModel datesModel : datesModelList){
            LocalDate currDateLocal = datesModel.getCurrentDate();
            LocalDate dateMid = datesModel.getSignupDate();
            LocalDate dateStart = dateMid.minusDays(30);
            LocalDate dateEnd = dateMid.plusDays(30);
            dateStart = dateStart.plusYears(1);

            if (dateStart.compareTo(currDateLocal) < 0){
                while (dateStart.plusYears(1).compareTo(currDateLocal) < 0) {
                    dateMid = dateMid.plusYears(1);
                    dateStart = dateMid.minusDays(30);
                    dateEnd = dateMid.plusDays(30);
                }

                if(dateStart.compareTo(currDateLocal) < 0 && dateEnd.compareTo(currDateLocal) > 0){
                    dateEnd = currDateLocal;
                }

                OutputModel outputModel = new OutputModel(dateStart, dateEnd);
                output.add(outputModel);

            }else{
                output.add(null);

            }
        }
        return output;
    }
}
