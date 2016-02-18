package adventskalender1;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag8 {
    public static void Lucka8 () {
        try {
            ImageIcon ikon = new ImageIcon(Dag8.class.getResource("/adventskalender1/julgran.png"));
            JOptionPane.showMessageDialog(Index.getInstance(), "8 December \n Idag ska vi räkna ut högsta och lägsta temperatur.",
                    "Lucka 8", JOptionPane.INFORMATION_MESSAGE, ikon);
            
            double högsta = -1.7e308;   // eller Double.MIN_VALUE
            double lägsta = 1.7e308;   // eller Double.MAX_VALUE
            int i = 0;

            while (true) {
                i++;
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Skriv en temperatur:");
                
                if(i == 1 && s == null) // Om användaren trycker cancel i första rutan
                    break;
                else if(s == null) // om användaren trycker cancel i någon annan ruta
                    break;
                
                double tal = Double.parseDouble(s);
                högsta = Math.max(högsta, tal);
                lägsta = Math.min(lägsta, tal);
            }
            JOptionPane.showMessageDialog(Index.getInstance(), "Lägsta: " + lägsta + "\nHögsta: " + högsta);
            
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning");
        }
    }
}
