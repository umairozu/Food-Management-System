import javax.swing.*;
import java.awt.event.*;
public class Clistner01 implements ActionListener {
    private JComboBox<String> comboBox;
    private FactoryModel factory = new FactoryModel();
    public Clistner01(JComboBox<String> comboBox) {
        this.comboBox = comboBox;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button.getText().matches("Buy")) {
                String selectedItem = (String) comboBox.getSelectedItem();
                factory.MatchingLine(factory.filePath, selectedItem);
                JFrame frame5 = new RateView();
                frame5.setTitle("Rate Page");
            } else if (button.getText().matches("Main Menu")) {
                JFrame frame6 = new MainView();
                frame6.setTitle("Main Menu");
            }
        }
    }
}
