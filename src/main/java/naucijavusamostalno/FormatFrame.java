package naucijavusamostalno;

import  javax.swing.*;

public class FormatFrame  extends JFrame{

    String[] subs = {"Burningbrid", "Freeform Goodness", "Inessential", "Manton.org"};
    JList<String> subList = new JList<String>(subs);

    public FormatFrame(){
        super("Subscriptions");
        setSize(150,335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscriptions: ");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);

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



