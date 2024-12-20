import javax.swing.*;
public class Wview extends JFrame {
    JPanel mainPanel;
    JLabel label1, label2;
    JTextField field1, field2;
    JButton button1;
    private FactoryModel factory;
    private Wmodel warehouse;

    public Wview() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);

        warehouse = new Wmodel();
        factory = new FactoryModel();
        /////////////////////////////////////////////////////

        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setLayout(null);

        label1 = new JLabel("Warehouse Location");
        label1.setBounds(0,0,250,50);
        mainPanel.add(label1);

        field1 = new JTextField();
        field1.setBounds(250,0,250,50);
        mainPanel.add(field1);
        ////////////////////////////////////////////////////////

        label2 = new JLabel("Date of Receiving");
        label2.setBounds(0,50,250,50);
        mainPanel.add(label2);

        field2 = new JTextField();
        field2.setBounds(250,50,250,50);
        mainPanel.add(field2);
        /////////////////////////////////////////////////////////

        button1 = new JButton("Receive Product");
        button1.setBounds(250,100,250,50);
        mainPanel.add(button1);
        button1.addActionListener(new Wlistner01(field1,field2,warehouse,factory));

        setVisible(true);
    }
}