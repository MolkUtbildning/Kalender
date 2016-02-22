package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag19 {
    public static void Lucka19 () {
        while (true) {   
            final ImageIcon icon = new ImageIcon(Dag19.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "19 December \nIdag ska du få testa om ett ord är ett Palindrom",
                   "Lucka 19", JOptionPane.INFORMATION_MESSAGE, icon);

            try {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Skriv in ett ord eller en text");
                
                if(s == null)
                    break;
                
                int i, j;

                for (i = 0, j = s.toLowerCase().length()-1; i<j && s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j); i++, j--); // en tom sats
                
                if (i >= j)
                    JOptionPane.showMessageDialog(Index.getInstance(), "Ditt ord är ett Palindrom");
                else
                    JOptionPane.showMessageDialog(Index.getInstance(), "Tyvärr det är inte ett palindrom");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
            }
        }
    }
}