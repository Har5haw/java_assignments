package Java_Assignment_4.Models;

import java.time.LocalDate;

public class DatesModel {
    private final LocalDate signupDate;
    private final LocalDate currentDate;

    public DatesModel(LocalDate signupDate, LocalDate currentDate) {
        this.signupDate = signupDate;
        this.currentDate = currentDate;
    }

    public LocalDate getSignupDate() {
        return signupDate;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

}
