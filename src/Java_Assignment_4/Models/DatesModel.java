package Java_Assignment_4.Models;

import java.time.LocalDate;

public class DatesModel {
    LocalDate signupDate;
    LocalDate currentDate;

    public DatesModel(LocalDate signupDate, LocalDate currentDate) {
        this.signupDate = signupDate;
        this.currentDate = currentDate;
    }

    public LocalDate getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(LocalDate signupDate) {
        this.signupDate = signupDate;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
}
