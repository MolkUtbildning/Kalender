package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag4 {
    public static void Lucka4 () {
        final ImageIcon icon = new ImageIcon(Dag4.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "4 December \nIdag ska du få ange lite personuppgifter", 
                "Lucka 4", JOptionPane.INFORMATION_MESSAGE, icon);
        
        String forname = JOptionPane.showInputDialog(null, "Skriv in förnamn","Skriv in förnamn");
        String lastname = JOptionPane.showInputDialog(null, "Skriv in efternamn", "Skriv in efternamn");
        
        JOptionPane.showMessageDialog(Index.getInstance(), "God Jul! " + forname + " " + lastname + "\nÖnskar Agilgrupp 6 " 
                + " Du använder " + System.getProperty("os.name") + " som operativsystem");
    }
}  

