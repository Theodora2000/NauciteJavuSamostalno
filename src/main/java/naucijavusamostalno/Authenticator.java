package naucijavusamostalno;
import javax.swing.*;

public class Authenticator extends  javax.swing.JFrame{

    JTextField username = new JTextField(15);//navedena sirina
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator(){
        super("Account Information");
        setSize(300,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JLabel userameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Paaword: ");
        JLabel commentLabel = new JLabel("Comments: ");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);//uvrtdjuje sta ce preci u sledeci red- tenutna rec
        pane.add(userameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentLabel);
        pane.add(comments);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
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
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}
