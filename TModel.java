public class TModel {
    public TModel(){
    }
    public boolean isValidDateFormat(String input) {
        return input.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    public boolean isAlphabetic(String input1,String input2,String input3,String input4) {
        return input1.matches("^[a-z A-Z]+$")
                && input2.matches("^[a-z A-Z]+$")
                && input3.matches("^[a-z A-Z]+$")
                && input4.matches("^[a-z A-Z]+$");
    }
}
