package Java_Assignment_4.Models;

import java.time.LocalDate;

/**
 * The type Output model.
 */
public class OutputModel {
    private final LocalDate startDate;
    private final LocalDate endDate;

    /**
     * Instantiates a new Output model.
     *
     * @param startDate the start date of window
     * @param endDate   the end date of window
     */
    public OutputModel(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Gets start date.
     *
     * @return the start date of window
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Gets end date.
     *
     * @return the end date of window
     */
    public LocalDate getEndDate() {
        return endDate;
    }

}
