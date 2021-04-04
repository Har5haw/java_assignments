package Java_Assignment_9.Models;

public class IsSentenceRegexModel {
    private final String input;
    private final String regex;

    public IsSentenceRegexModel(String input) {
        this.input = input;
        this.regex = "^[A-Z].*\\.$";
    }

    public String getInput() {
        return input;
    }

    public String getRegex() {
        return regex;
    }
}
