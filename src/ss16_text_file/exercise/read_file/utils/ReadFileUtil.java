package ss16_text_file.exercise.read_file.utils;

import ss16_text_file.exercise.read_file.model.Country;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_text_file/exercise/read_file/view/text1.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] info;

        List<Country> countries = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            countries.add(new Country(Integer.parseInt(info[0]), info[1], info[2]));
        }
        bufferedReader.close();
        for (Country country : countries) {
            System.out.println(country.getInfo());
        }

    }
}