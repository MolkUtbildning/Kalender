package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag16 {
    public static void Lucka16 () {
        ImageIcon ikon = new ImageIcon(Dag16.class.getResource("/adventskalender1/julgran.png"));
        JOptionPane.showMessageDialog(Index.getInstance(), "16 December \n Idag ska vi testa på att spegelvända ord.",
                "Lucka 16", JOptionPane.INFORMATION_MESSAGE, ikon);

        while (true) {
            String baklanges = "";
            String ord = JOptionPane.showInputDialog(Index.getInstance(), "Skriv in ett julord:");

            if (ord == null)
                break;

            for (int i = ord.length() - 1; i >= 0; i--)
                baklanges = baklanges + ord.charAt(i);

            JOptionPane.showMessageDialog(Index.getInstance(), baklanges, "Lucka 16", JOptionPane.INFORMATION_MESSAGE, ikon);
        }
    }
}