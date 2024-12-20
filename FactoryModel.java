import java.io.*;
public class FactoryModel {
    String filePath = "addedItems.txt";
    public FactoryModel() {
    }
    public boolean isValidDateFormat(String input) {
        return input.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    public boolean isAlphabetic(String input1, String input2, String input4) {
        return input1.matches("^[a-z A-Z]+$") && input2.matches("^[a-z A-Z]+$") && input4.matches("^[a-z A-Z]+$");
    }
    public boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
    static void writeToFile(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void eraseFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File erased successfully.");
            } else {
                System.out.println("Failed to erase the file.");
            }
        }
    }
    static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    public String MatchingLine(String filePath, String condition) {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(condition)) {
                    result.append(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading the file";
        }
        return result.toString();
    }
}