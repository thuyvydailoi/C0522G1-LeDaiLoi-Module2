package ss12_map.exercise.product.model;

import java.io.*;

class FileNotFoundExceptionTest {
    public static void main(String[] args) throws IOException {
        readFailingFile("file.txt");
    }

    public static void readFailingFile(String fileName) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(new File(fileName)));
        rd.readLine();
    }

    public static class BusinessException extends RuntimeException {
        public BusinessException(String string, FileNotFoundException ex) {
            super(string, ex);
        }
    }
}
