package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag9 {
    public static void Lucka9 () {
        ImageIcon ikon = new ImageIcon(Dag9.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "9 December\n Idag ska vi titta på om det är billigare att köpa "
                + "årskort eller biljett?", "Lucka 9", JOptionPane.INFORMATION_MESSAGE, ikon);
        
        double årskort = 0;
        double biljett = 0;
        int gånger = 0;
        
        while (true) {
            String s = JOptionPane.showInputDialog(Index.getInstance(), "Vad kostar ett årskort? ");
            
            if (s == null)
                break;
            
            while (true) {
                try {
                    årskort = Double.parseDouble(s);

                    if (årskort > 0)
                        break; // inläsning var ok
                    else {
                        s = JOptionPane.showInputDialog(Index.getInstance(), "Årskortet kan inte kosta 0 kr");
                        
                        if(s == null)
                            break;
                    }
                    
                } catch (NumberFormatException e) {
                    s = JOptionPane.showInputDialog(Index.getInstance(), "Felaktigt inmatning\n Ange årskortspriset i kr");
                }
            }
            s = JOptionPane.showInputDialog(Index.getInstance(), "Vad är priset för en engångsbiljett?");
            
            if (s == null)
                break;
            
            while (true) {
                try {
                    biljett = Double.parseDouble(s);

                    if (biljett > 0) {
                        break;
                 } else {
                        s = JOptionPane.showInputDialog(Index.getInstance(), "Biljetten kan inte kosta 0 kr");

                        if(s == null)
                            break;
                    }
                    
                } catch (NumberFormatException e1) {
                    s = JOptionPane.showInputDialog(Index.getInstance(), "Felaktigt inmatning\n Ange biljettpriset i kr");
                }
            }
            
            s = JOptionPane.showInputDialog(Index.getInstance(), "Hur många gånger per år tränar du?");
            
            if (s == null)
                break;
            
            while (true) {
                try {
                    gånger = Integer.parseInt(s);
                    
                    if (gånger > 0) {
                        break;
                    } else {
                        s = JOptionPane.showInputDialog(Index.getInstance(), "Du måste träna minst en gång, tjockis.");

                        if(s == null)
                            break;
                    }
                    
                } catch (NumberFormatException e1) {
                    s = JOptionPane.showInputDialog(Index.getInstance(), "Felaktigt inmatning\n Ange antal gånger:");
                }
            }

            double total = biljett * gånger;
            
            if (total > årskort)
                JOptionPane.showMessageDialog(Index.getInstance(), "Det lönar sig att köpa ett årskort");
            else if (total < årskort)
                JOptionPane.showMessageDialog(Index.getInstance(), "Det lönar sig att köpa engångsbiljetter");
            else if (total == årskort)
                JOptionPane.showMessageDialog(Index.getInstance(), "Det spelar ingen roll");
        }
    }
}