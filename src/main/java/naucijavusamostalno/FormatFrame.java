package naucijavusamostalno;

import  javax.swing.*;

public class FormatFrame  extends JFrame{

    String[] formats = {"Atom", "RSS 0.92","RSS 1.0","RSS 2.0"};
    JComboBox<String> formatBox = new JComboBox<String>(formats);

    public FormatFrame(){
        super("Choose a Format");
        setSize(220,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel formatLabel = new JLabel("Output formats:");
        panel.add(formatLabel);
        panel.add(formatBox);
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String [] args){
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}



