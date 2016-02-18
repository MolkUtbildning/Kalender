package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag6 {
    public static void Lucka6 () {
        try {
            ImageIcon ikon = new ImageIcon(Dag6.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "6 December \n Idag ska vi räkna ut kostnad för att ringa.",
                    "Lucka 6", JOptionPane.INFORMATION_MESSAGE, ikon);
            
            while (true) {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Antal minuter per månad?");
                
                if (s == null)
                    break;
                
                int min = Integer.parseInt(s);
                
                s = JOptionPane.showInputDialog(Index.getInstance(), "Pris per minut?");
                
                double minutpris = Double.parseDouble(s);
                double kostnad = min*minutpris;
                
                JOptionPane.showMessageDialog(Index.getInstance(), "Månadskostnad: " + kostnad);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning");
        }
    }
}