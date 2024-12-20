import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tlistner01 implements ActionListener {
    JTextField field1, field2, field3, field4, field5;
    private TModel transporter;
    private FactoryModel factory;
    public Tlistner01(JTextField field1, JTextField field2, JTextField field3, JTextField field4, JTextField field5, TModel transporter, FactoryModel factory) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.transporter = transporter;
        this.factory =factory;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String enteredDate = field5.getText();

        if (transporter.isValidDateFormat(enteredDate)
                && transporter.isAlphabetic(field1.getText(), field2.getText(), field3.getText(), field4.getText())) {

        factory.writeToFile(factory.filePath,","+ field1.getText() +"," + field2.getText() +"," + field3.getText() +"," +
                            field4.getText() +"," +
                            field5.getText());
            JFrame frame3 = new Wview();
            frame3.setTitle("Warehouse Page");

        } else if (field1.getText().isBlank() || field2.getText().isBlank()
                || field3.getText().isBlank() || field4.getText().isBlank()
                || field5.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Normal people fill all fields, YOU STUPID PIECE OF DIRT!");
        } else if (!transporter.isValidDateFormat(enteredDate)) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter a date in the format: yyyy-mm-dd");
        } else if (!transporter.isAlphabetic(field1.getText(), field2.getText(), field3.getText(), field4.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid entry detected");
        }
    }
}