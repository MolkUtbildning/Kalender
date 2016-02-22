package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag17 {
    public static void Lucka17 () {
        try {
            ImageIcon ikon = new ImageIcon(Dag17.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "17 December \n Idag ska vi testa på att skriva ut gångertabellen.",
                    "Lucka 17", JOptionPane.INFORMATION_MESSAGE, ikon);

            while (true) {
                String rader = JOptionPane.showInputDialog(Index.getInstance(), "Ange hur många gångertabeller du vill visa (Ej decimaler, bara heltal):");
                String tabell = "";
                
                if (rader == null)
                    break;
                
                int rad = Integer.parseInt(rader);

                for (int i = 1; i <= rad; i++) {
                    for (int x = 1; x <= i; x++) {
                        tabell = tabell + i * x + "  ";
                    }
                    tabell = tabell + "\n";
                    //System.out.println(i);
                }
                JOptionPane.showMessageDialog(Index.getInstance(), tabell, "Lucka 17", JOptionPane.INFORMATION_MESSAGE, ikon);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
        }
    }
}