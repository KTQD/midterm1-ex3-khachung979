import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // Thay đổi đường dẫn đến input.txt
        String outputFile = "output.txt";

        replaceText(inputFilePath, outputFile, "Nha Trang", "Vũng Tàu");
    }

    public static void replaceText(String inputFile, String outputFileName, String targetWord, String replacement) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(targetWord, replacement);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Thay thế thành công và ghi ra file " + outputFileName);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
