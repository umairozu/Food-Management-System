import javax.swing.*;
import java.awt.*;
public class MainView extends JFrame {
    JPanel mainMenu;
    JButton button1, button2;
    public MainView(){
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainMenu = new JPanel();
        add(mainMenu);
        mainMenu.setLayout(new FlowLayout());

        button1 = new JButton("Create Food Item");
        mainMenu.add(button1);
        button1.addActionListener(new MainMenuListener());

        button2 = new JButton("Customer Page");
        mainMenu.add(button2);
        button2.addActionListener(new MainMenuListener());

        setVisible(true);
    }
}
