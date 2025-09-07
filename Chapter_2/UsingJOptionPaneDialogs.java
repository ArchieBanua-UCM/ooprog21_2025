import javax.swing.JOptionPane;
public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String Fname; 
        String Lname; 
        int confirmResult;

     do {
    Fname = JOptionPane.showInputDialog(null, "What is you're name? ");
    Lname = JOptionPane.showInputDialog(null, "Whats you're lastname? ");
        
    if (Fname == null) {
        System.exit(0);
    }

    confirmResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "cofirmation", JOptionPane.YES_NO_OPTION);

} while (confirmResult == JOptionPane.NO_OPTION);

JOptionPane.showMessageDialog(null, "Hello, " + Fname + Lname);

    }
 }