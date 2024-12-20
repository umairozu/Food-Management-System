import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        FactoryModel factory = new FactoryModel();
        JFrame mainMenu = new MainView();
        mainMenu.setTitle("Main Menu");
        //Runtime.getRuntime().addShutdownHook(new Thread(() -> factory.eraseFile(factory.filePath)));
    }
}