package Java_Assignment_4.Models;

import java.time.LocalDate;

public class OutputModel {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public OutputModel(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

}
