package naucijavusamostalno;

import javax.swing.*;
import java.awt.*;

public class FeedInfo extends JFrame {
    private final JLabel nameLabel = new JLabel("Name: ",SwingConstants.RIGHT);
    private final JTextField name;
    private final JLabel urlLabel = new JLabel("URL: ", SwingConstants.RIGHT);
    private final JTextField url;
    private final JLabel typeLabel = new JLabel("Type: ", SwingConstants.RIGHT);
    private final JTextField type;

    public FeedInfo(){
        super("Feed information");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        String response1= JOptionPane.showInputDialog(null, "Enter the site name: ");
        name = new JTextField(response1,20);

        String response2= JOptionPane.showInputDialog(null, "Enter the site address: ");
        url = new JTextField(response2,20);

        String[] choices = {"Personal", "Commercial", "Unknown"};
        int response3 = JOptionPane.showOptionDialog(null, "What type of site it is?", "Site Type", 0, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        type= new JTextField(choices[response3], 20);

        setLayout(new GridLayout(3,2));
        add(nameLabel);
        add(name);
        add(urlLabel);
        add(url);
        add(typeLabel);
        add(type);
        setLookAndFeel();
        setVisible(true);

    }

    private  void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exc){
            System.out.println("Couldnt use the system "+ "look and feel: " + exc);
        }
    }

    public static void  main (String[] arguments){
        FeedInfo frame = new FeedInfo();
    }
}
