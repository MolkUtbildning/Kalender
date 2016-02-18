package adventskalender1;

import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag2 {
    public static void Lucka2 () {
        final ImageIcon icon = new ImageIcon(Dag2.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "2 December \nIdag ska du få reda på dagens datum ", "Lucka 2",
                JOptionPane.INFORMATION_MESSAGE, icon);
        
        JOptionPane.showMessageDialog(Index.getInstance(), "Dagens datum : "+Calendar.getInstance().getTime().toString());
    }    
}
