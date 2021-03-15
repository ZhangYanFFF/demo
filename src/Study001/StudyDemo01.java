package Study001;

import java.io.*;

public class StudyDemo01 {

//    main主函数
    public static void main(String[] args) throws IOException {
        StudyDemo01 studyDemo01 = new StudyDemo01();
        studyDemo01.fileTextRead();

    }

//    文件读取
    public void fileTextRead() throws IOException {
//        操作文件地址
        String fileName = "F:/test.txt";
//        File file = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        bufferedReader.readLine();

//        for (int i=0;i<=i+1;i++){
//            String readLineTest = bufferedReader.readLine();
//            if (readLineTest != null)
//                System.out.println(bufferedReader.readLine());
//            else {
//                return;
//            }
//        }
        while (((bufferedReader.readLine())==null)){
            System.out.println(bufferedReader.readLine());
        }

        bufferedReader.close();
    }
}

