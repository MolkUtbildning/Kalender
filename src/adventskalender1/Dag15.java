package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag15 {
    public static void Lucka15 () {
        try {
            double viktFlinga = 0.001;

            boolean done = true;
            ImageIcon ikon = new ImageIcon(Dag15.class.getResource("/adventskalender1/julgran.png"));

            JOptionPane.showMessageDialog(Index.getInstance(), "15 December \nIdag ska vi räkna snöflingor.", "Lucka 15",
                    JOptionPane.INFORMATION_MESSAGE, ikon);

            while (done) {
                String flingor = JOptionPane.showInputDialog(Index.getInstance(), "Ange en vikt i gram:");

                if (flingor == null) {
                    break;
                }

                if (Integer.parseInt(flingor) < 0) {
                    JOptionPane.showMessageDialog(Index.getInstance(), "Du kan ju inte skriva in ett negativt värde, dummer!","Lucka 15", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                else {

                int antal = Integer.parseInt(flingor);
                double i = antal / viktFlinga;

                JOptionPane.showMessageDialog(Index.getInstance(), antal + " gram motsvarar " + i + " st snöflingor. Enligt komplicerade beräkningar så har vi kommit fram till att en snöflinga väger ungefär " + viktFlinga, "Lucka 15",
                        JOptionPane.INFORMATION_MESSAGE, ikon);
            }
                done = false;
        }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!","Lucka 15", JOptionPane.WARNING_MESSAGE);
        }
    }
}
