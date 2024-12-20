import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rlistner01 implements ActionListener {
    JTextField field1;
    JTextArea area1;
    JComboBox<String> comboBox;
    private RModel rate;
    private FactoryModel factory;
    public Rlistner01(JTextField field1,JTextArea area1,JComboBox comboBox, RModel rate, FactoryModel factory) {
        this.field1 = field1;
        this.area1 = area1;
        this.comboBox = comboBox;
        this.rate = rate;
        this.factory = factory;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button.getText().matches("Main Menu")) {
                JFrame frame6 = new MainView();
                frame6.setTitle("Main Menu");
            }
              else if (button.getText().matches("Submit")) {
                    if (rate.isAlphabetic(field1.getText())) {
                        factory.writeToFile(factory.filePath,","+ field1.getText() + "," + comboBox.getSelectedItem());
                        String content = factory.readFromFile(factory.filePath);
                        area1.setText(content);
                    }
                }
            }
        }
    }