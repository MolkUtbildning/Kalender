package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag12 {
    public static void Lucka12 () {
        ImageIcon ikon = new ImageIcon(Dag12.class.getResource("/adventskalender1/julgran.png"));
        ImageIcon flinga = new ImageIcon(Dag6.class.getResource("/adventskalender1/flinga.jpg"));

        JOptionPane.showMessageDialog(Index.getInstance(), "12 December \nIdag ska vi testa på att göra val i dialogrutor.",
                "Lucka 12", JOptionPane.INFORMATION_MESSAGE, ikon);
        
        String[] knappar = {"Ja", "Nej", "Avbryt"};
        
        while (true) {
            int val = JOptionPane.showOptionDialog(Index.getInstance(), "Snöar det ute idag?", "Lucka 12", 0,
                    JOptionPane.INFORMATION_MESSAGE, flinga, knappar,knappar[2]);
            if (val == 0) // ja
                JOptionPane.showMessageDialog(Index.getInstance(), "Jag ser det snöar, jag ser det snöar!", "Lucka 12",
                        JOptionPane.INFORMATION_MESSAGE, flinga);
            else if (val == 1) // nej
                JOptionPane.showMessageDialog(Index.getInstance(), "Ingen jul utan snö!", "Lucka 12",
                        JOptionPane.INFORMATION_MESSAGE, flinga);
            else
                break;
        }
    }
}