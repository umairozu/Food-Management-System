import javax.swing.*;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
public class Wlistner01 implements ActionListener {
    JTextField field1, field2;
    private Wmodel warehouse;
    private FactoryModel factory;
    public Wlistner01(JTextField field1, JTextField field2, Wmodel warehouse, FactoryModel factory) {
        this.field1 = field1;
        this.field2 = field2;
        this.warehouse = warehouse;
        this.factory = factory;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String enteredDate = field2.getText();

        if (warehouse.isValidDateFormat(enteredDate)
                && warehouse.isAlphabetic(field1.getText())) {

            factory.writeToFile(factory.filePath,","+ field1.getText() +"," + field2.getText()+"\n");

            if (e.getSource() instanceof JButton) {
                JButton button = (JButton) e.getSource();
                if (button.getText().matches("Receive Product")) {
                    JFrame frame4 = new CustomerView();
                    frame4.setTitle("Customer Page");
                }
            } else if (field1.getText().isBlank() || field2.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Normal people fill all fields, YOU STUPID PIECE OF DIRT!");
            } else if (!warehouse.isValidDateFormat(enteredDate)) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Please enter a date in the format: yyyy-mm-dd");
            } else if (!warehouse.isAlphabetic(field1.getText())) {
                JOptionPane.showMessageDialog(null, "Invalid entry detected");
            }
        }
    }
}