package Java_Assignment_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    protected final String fileName;
    protected final Scanner fileContent;

    public ReadFile(String input) throws FileNotFoundException {
        this.fileName = input;
        File file =  new File(fileName);
        this.fileContent = new Scanner(file);
    }

    public String getFileName() {
        return fileName;
    }

    public Scanner getFileContent() {
        return fileContent;
    }


}
