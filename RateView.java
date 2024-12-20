import javax.swing.*;
public class RateView extends JFrame {
    JTextArea area1;
    JScrollPane pane1;
    JPanel mainPanel;
    JLabel label1, label2;
    JTextField field1;
    JComboBox<String> comboBox;
    JButton button1, button2;
    private FactoryModel factory;
    private RModel rate;
    private foodOrders foodOrder;

    public RateView() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        factory = new FactoryModel();
        rate = new RModel();
        foodOrder = new foodOrders();
        /////////////////////////////////////////////////////

        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setLayout(null);

        area1 = new JTextArea();
        area1.setBounds(0, 0, 250, 250);
        mainPanel.add(area1);

        foodOrder.splitFile01();
        String content = factory.readFromFile(factory.filePath);
         area1.setText(content);

        pane1 = new JScrollPane(area1);
        pane1.setBounds(0,0,250,250);
        pane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mainPanel.add(pane1);
        /////////////////////////////////////////////////////

       label1 = new JLabel("Comment: ");
        label1.setBounds(250, 100, 100, 100);
        mainPanel.add(label1);

        field1 = new JTextField();
        field1.setBounds(320, 130, 100, 30);
        mainPanel.add(field1);
        /////////////////////////////////////////////////////

        label2 = new JLabel("Rating: ");
        label2.setBounds(425, 100, 100, 100);
        mainPanel.add(label2);

        comboBox = new JComboBox<>();
        String[] options = { "1", "2", "3", "4", "5"};
        for (String option : options) {
            comboBox.addItem(option);
        }
        comboBox.setBounds(470,130,40,30);
        mainPanel.add(comboBox);
        /////////////////////////////////////////////////////////

        button1 = new JButton("Submit");
        button1.setBounds(230, 270, 100, 25);
        mainPanel.add(button1);
        button1.addActionListener(new Rlistner01(field1,area1,comboBox,rate,factory));
        /////////////////////////////////////////////////////////

        button2 = new JButton("Main Menu");
        button2.setBounds(340, 270, 100, 25);
        mainPanel.add(button2);
        button2.addActionListener(new Rlistner01(field1,area1,comboBox,rate,factory));

        setVisible(true);
    }
}
