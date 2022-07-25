package ss17_binary_file.exercise.copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static class Main {
        private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }

        private static void copyFileUsingStream(File source, File dest) throws IOException {
            FileInputStream inputStream = null;
            OutputStream outputStream = null;
            int count = 0;
            try {
                inputStream = new FileInputStream(source);
                outputStream = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                    count += length;
                }
                System.out.println("Số tệp trong file là:" + count);
            } finally {
                inputStream.close();
                outputStream.close();
            }
        }

        public static void main(String[] args) {
            String sourcePath = "src/ss17_binary_file/exercise/copy_file/soucre.csv";
            String targetPath = "src/ss17_binary_file/exercise/copy_file/target.csv";

            try {
                File sourceFile = new File(sourcePath);
                File targetFile = new File(targetPath);
                if (targetFile.exists()) {
                    throw new CopyFileException("File đã tồn tại!!!");
                }
                copyFileUsingStream(sourceFile, targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (CopyFileException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
