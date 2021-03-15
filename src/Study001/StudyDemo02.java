package Study001;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudyDemo02 {

    String fileName = "F:/test.txt";

    public static void main(String[] args) throws IOException {
        StudyDemo02 studyDemo02 = new StudyDemo02();
        studyDemo02.fileWriteTestDemo();
    }

    public void fileWriteTestDemo() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("123456789");
        bufferedWriter.close();
    }
}
