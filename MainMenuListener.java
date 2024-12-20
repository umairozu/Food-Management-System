import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainMenuListener implements ActionListener {
    public MainMenuListener(){
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button.getText().matches("Create Food Item")) {
                JFrame frame1 = new FactoryView();
                frame1.setTitle("Factory Page");
            } else if (button.getText().matches("Customer Page")) {
                JFrame frame4 = new CustomerView();
                frame4.setTitle("Customer Page");
            }
        }
    }
}