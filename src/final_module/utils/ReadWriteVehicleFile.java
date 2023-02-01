package final_module.utils;

import final_module.model.Oto;
import final_module.model.Truck;
import final_module.model.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteVehicleFile {
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

    public static List<Vehicle> readVehicleFile(String path) {
        List<String> stringList = readFile(path);
        List<Vehicle> vehicleList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 8) {
                vehicleList.add(new Oto(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        info[4],
                        info[5], info[6], info[7]));
            } else if (info.length == 7) {
                vehicleList.add(new Truck(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        info[4],
                        info[5],
                        info[6]));
            }
        }

        return vehicleList;
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

    public static void writeVehicleFile(String path, List<Vehicle> vehicleList) {
        StringBuilder data = new StringBuilder();
        for (Vehicle vehicle : vehicleList) {
            data.append(vehicle.getInfo());
        }

        writeFile(path, data.toString());
    }
}
