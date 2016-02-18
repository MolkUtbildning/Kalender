package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag15 {
    public static void Lucka15 () {
        try {
            double viktFlinga = 0.001;
            
            ImageIcon ikon = new ImageIcon(Dag15.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "15 December \nIdag ska vi räkna snöflingor.", "Lucka 15",
                    JOptionPane.INFORMATION_MESSAGE, ikon);
            
            while (true) {
                String flingor = JOptionPane.showInputDialog(Index.getInstance(), "Ange en vikt i gram:");
                
                if (flingor == null)
                    break;
                
                int antal = Integer.parseInt(flingor);
                double i = antal / viktFlinga;

                JOptionPane.showMessageDialog(Index.getInstance(), antal + " gram motsvarar " + i + " st snöflingor.", "Lucka 15",
                        JOptionPane.INFORMATION_MESSAGE, ikon);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!","Lucka 15", JOptionPane.WARNING_MESSAGE);
        }
    }
}
