package naucijavusamostalno;

import javax.swing.*;

public class Slider extends JFrame {

    public Slider(){
        super("Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
        pick.setMajorTickSpacing(10);
        pick.setMinorTickSpacing(1);
        pick.setPaintTicks(true);
        pick.setPaintLabels(true);
        add(pick);
        pack();
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

    public static void main(String[] arg){
        Slider frame = new Slider();
    }

}
