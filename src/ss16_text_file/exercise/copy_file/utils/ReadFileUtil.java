package ss16_text_file.exercise.copy_file.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);

        int sum = 0;
        String line = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Số ký tự trong file là: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String strings : list) {
                bufferedWriter.write(strings);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public static void main(String[] args) {
        String sourceText = "src/ss16_text_file/exercise/copy_file/view/text.csv";
        String copyText ="src/ss16_text_file/exercise/copy_file/view/text2.csv";
        ReadFileUtil.writeFile(copyText, ReadFileUtil.readFile(sourceText));
    }
}
