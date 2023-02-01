package final_module.utils;

import final_module.model.Register;
import ss10_dsa.exercise.mvc_2.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteRegisterFile {
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

    public static List<Register> readRegisterFile(String path) {
        List<String> stringList = readFile(path);
        List<Register> registerList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 4)
                registerList.add(new Register(Integer.parseInt(info[0]), info[1], info[2], info[3]));
        }
        return registerList;
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

    public static void writeRegisterFile(String path, List<Register> registers) {
        StringBuilder data = new StringBuilder();
        for (Register register : registers) {
            data.append(register.getInfo());
        }

        writeFile(path, data.toString());
    }
}



