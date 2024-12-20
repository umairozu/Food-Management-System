import javax.swing.*;
public class TView extends JFrame {
    JPanel mainPanel;
    JLabel label1,label2,label3,label4,label5;
    JTextField field1,field2,field3,field4,field5;

    JButton button1;
    private TModel transporter;
    private FactoryModel factory;
    public TView(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,350);

        transporter = new TModel();
        factory = new FactoryModel();
        /////////////////////////////////////////////////////

        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setLayout(null);

        label1 = new JLabel("Transporter Company");
        label1.setBounds(0,0,250,50);
        mainPanel.add(label1);

        field1 = new JTextField();
        field1.setBounds(250,0,250,50);
        mainPanel.add(field1);
        ////////////////////////////////////////////////////////

        label2 = new JLabel("Office Location");
        label2.setBounds(0,50,250,50);
        mainPanel.add(label2);

        field2 = new JTextField();
        field2.setBounds(250,50,250,50);
        mainPanel.add(field2);
        /////////////////////////////////////////////////////////

        label3 = new JLabel("Food Source");
        label3.setBounds(0,100,250,50);
        mainPanel.add(label3);

        field3 = new JTextField();
        field3.setBounds(250,100,250,50);
        mainPanel.add(field3);
        /////////////////////////////////////////////////////////

        label4 = new JLabel("Food Destination");
        label4.setBounds(0,150,250,50);
        mainPanel.add(label4);

        field4 = new JTextField();
        field4.setBounds(250,150,250,50);
        mainPanel.add(field4);
        /////////////////////////////////////////////////////////

        label5 = new JLabel("Expected Delivery Date");
        label5.setBounds(0,200,250,50);
        mainPanel.add(label5);

        field5 = new JTextField();
        field5.setBounds(250,200,250,50);
        mainPanel.add(field5);
        /////////////////////////////////////////////////////////

        button1 = new JButton("Add Shipping Details");
        button1.setBounds(250,250,250,50);
        mainPanel.add(button1);
        button1.addActionListener(new Tlistner01(field1,field2,field3,field4,field5,transporter,factory));

        setVisible(true);
    }
}
