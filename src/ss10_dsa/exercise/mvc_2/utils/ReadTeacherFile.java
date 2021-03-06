package ss10_dsa.exercise.mvc_2.utils;

import ss10_dsa.exercise.mvc_2.model.Student;
import ss10_dsa.exercise.mvc_2.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTeacherFile {
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

    public static List<Teacher> readStudentFile(String path) {
        List<String> stringList = readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 5) {
                teacherList.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4]));
            }
        }

        return teacherList;
    }
}
