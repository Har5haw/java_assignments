package Java_Assignment_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    private final String fileName;

    public WriteFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void write(String content) throws IOException {
        File newFile = new File("result.txt");
        //if (!newFile.exists()){
            newFile.createNewFile();

        FileWriter fileWriter = new FileWriter(newFile);

        fileWriter.write(content);

        fileWriter.close();
    }
}
