package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag5 {
    public static void Lucka5 () {
        ImageIcon ikon = new ImageIcon(Dag5.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "5 December \nIdag ska du få ditt namn utskrivet på skärmen",
                "Lucka 5", JOptionPane.INFORMATION_MESSAGE, ikon);
        
        while (true) {
            String s = JOptionPane.showInputDialog(Index.getInstance(), "Vad heter du?");

            if( s == null)
                break;

            JOptionPane.showMessageDialog(Index.getInstance(), "Hej " + s);
        }
    }
}