package Java_Assignment_4.Models;

import java.time.LocalDate;

/**
 * The type Dates model.
 */
public class DatesModel {
    private final LocalDate signupDate;
    private final LocalDate currentDate;

    /**
     * Instantiates a new Dates model.
     *
     * @param signupDate  the signup date
     * @param currentDate the current date
     */
    public DatesModel(LocalDate signupDate, LocalDate currentDate) {
        this.signupDate = signupDate;
        this.currentDate = currentDate;
    }

    /**
     * Gets signup date.
     *
     * @return the signup date
     */
    public LocalDate getSignupDate() {
        return signupDate;
    }

    /**
     * Gets current date.
     *
     * @return the current date
     */
    public LocalDate getCurrentDate() {
        return currentDate;
    }

}
