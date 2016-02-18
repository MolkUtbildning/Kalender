package adventskalender1;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag11 {
    public static void Lucka11 () {
        while (true) {
            try {
                ImageIcon ikon = new ImageIcon(Dag11.class.getResource("/adventskalender1/julgran.png"));

                JOptionPane.showMessageDialog(Index.getInstance(), "11 December \n Idag ska du kunna testa om ett årtal är skottår "
                        + "eller inte.", "Lucka 11", JOptionPane.INFORMATION_MESSAGE, ikon);

                String s = JOptionPane.showInputDialog(Index.getInstance(), "Mata in ett årtal som du vill se om det år ett skottår:");
                
                if (s == null) 
                    break;

                int year = Integer.parseInt(s);
                
                if (year > 1754 && year % 4 == 0 && year % 100 != 0 || year > 1754 && year % 400 == 0)
                    JOptionPane.showMessageDialog(Index.getInstance(), year + " är ett skottår!");
                else if (year < 1754)
                    JOptionPane.showMessageDialog(Index.getInstance(), "Skottår hade inte införts än.");
                else
                    JOptionPane.showMessageDialog(Index.getInstance(), year + " är inte ett skottår");
                
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
            }
        }
    }
}
