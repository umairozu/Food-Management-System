import javax.swing.*;
import java.util.List;
public class CustomerView extends JFrame {
    JPanel mainPanel;
    JLabel label1;
    JButton button1, button2;
    JComboBox<String> comboBox;
    public foodOrders foodOrder;
    public CustomerView() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);

        foodOrder = new foodOrders();
        /////////////////////////////////////////////////////

        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setLayout(null);

        label1 = new JLabel("Select Product");
        label1.setBounds(0, 8, 200, 30);
        mainPanel.add(label1);
        /////////////////////////////////////////////////////

        comboBox = new JComboBox<>();
        comboBox.setBounds(100, 10, 100, 25);
        mainPanel.add(comboBox);

        List<String[]> lines = foodOrder.splitFile01();
        for (String[] parts : lines) {
            if (parts.length > 0) {
                String firstPart = parts[0];
                comboBox.addItem(firstPart);
            }
        }
        /////////////////////////////////////////////////////////

        button1 = new JButton("Buy");
        button1.setBounds(200, 10, 100, 25);
        mainPanel.add(button1);
        button1.addActionListener(new Clistner01(comboBox));
        /////////////////////////////////////////////////////////

        button2 = new JButton("Main Menu");
        button2.setBounds(300, 10, 100, 25);
        mainPanel.add(button2);
        button2.addActionListener(new Clistner01(comboBox));

        setVisible(true);
    }
}

