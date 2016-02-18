package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag1 {
    public static void Lucka1 () {
        final ImageIcon icon = new ImageIcon(Dag1.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "1 December \nIdag ska du få se ditt användarnamn ", "Lucka 1",
                JOptionPane.INFORMATION_MESSAGE, icon);
        
        JOptionPane.showMessageDialog(Index.getInstance(),"Hej "+System.getProperty("user.name")+" och välkommen till december! ");
    }
}



