package Java_Assignment_9;

import Java_Assignment_9.Interfaces.IsSentenceInterface;
import Java_Assignment_9.Models.IsSentenceRegexModel;

import java.util.regex.Pattern;

public class IsSentence implements IsSentenceInterface {

    private final IsSentenceRegexModel regexModel;

    public IsSentence(IsSentenceRegexModel regexModel) {
        this.regexModel = regexModel;
    }

    public IsSentenceRegexModel getRegexModel() {
        return regexModel;
    }

    @Override
    public boolean check() {
        return Pattern.matches(regexModel.getRegex(), regexModel.getInput());
    }
}
