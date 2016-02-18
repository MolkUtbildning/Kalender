package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Created by Blackchim on 2015-11-17.
 */
class Dag3 {
    public static void Lucka3 () {
        final ImageIcon icon = new ImageIcon(Dag3.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "3 December \nIdag ska du få reda på antal tecken i en mening! ",
                "Lucka 3", JOptionPane.INFORMATION_MESSAGE, icon);
        
        while (true) {
        String s = JOptionPane.showInputDialog("Programmet räkna ut antal tecken i en mening: ");
        
        if(s == null)
            break;
        
        JOptionPane.showMessageDialog(Index.getInstance(), "Din mening '" + s + "' har: " + s.length() + " tecken.");
        }
    }
}
