public class Wmodel {
    public Wmodel() {
    }
    public boolean isValidDateFormat(String input) {
        return input.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    public boolean isAlphabetic (String input1){
        return input1.matches("^[a-z A-Z]+$");
    }
}
