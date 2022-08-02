package demo.ss0_p.utils;

import demo.ss0_p.model.CellPhone;
import demo.ss0_p.model.GenuinePhone;
import demo.ss0_p.model.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWritePhoneFileUtil {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static List<Phone> readPhoneFile(String path) {
        List<String> stringList = readFile(path);
        List<Phone> phoneList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info[6].equals("Trong Nuoc") || info[6].equals("Quoc Te")) {
                phoneList.add(new GenuinePhone(
                        Integer.parseInt(info[0]),
                        info[1],
                        Integer.parseInt(info[2]),
                        Integer.parseInt(info[3]),
                        info[4],
                        Integer.parseInt(info[5]),
                        info[6]));
            } else if (info[6].equals("Da Sua Chua") || info[6].equals("Chua Sua Chua")) {
                phoneList.add(new CellPhone(
                        Integer.parseInt(info[0]),
                        info[1],
                        Integer.parseInt(info[2]),
                        Integer.parseInt(info[3]),
                        info[4],
                        info[5],
                        info[6]));

            }
        }

        return phoneList;
    }

    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writePhoneFile(String path, List<Phone> phoneList) {
        StringBuilder data = new StringBuilder();
        for (Phone phone : phoneList) {
            data.append(phone.getInfo());
        }

        writeFile(path, data.toString());
    }
}
