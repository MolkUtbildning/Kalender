package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag18 {
    public static void Lucka18 () {
        while (true) {
            ImageIcon ikon = new ImageIcon(Dag18.class.getResource("/adventskalender1/julgran.png"));
            
            JOptionPane.showMessageDialog(Index.getInstance(), "18 December \n Idag ska vi testa att skriva en önskelista!",
                    "Lucka 18", JOptionPane.INFORMATION_MESSAGE, ikon);
            
            try {
                String antalOnskningar = JOptionPane.showInputDialog(Index.getInstance(), "Hur många önskningar har du på din önskelista?");
                
                if (antalOnskningar == null)
                    break;
                
                int nr = Integer.parseInt(antalOnskningar);
                String text = "";

                for (int onsk = 1; onsk <= nr; onsk++) {
                    String sak = JOptionPane.showInputDialog(Index.getInstance(), "Skriv in din " + onsk + ":a önskning:");
                    
                    if (sak == null)
                        break;
                    
                    text = text + onsk + "." + "  " + sak + "\n";
                }
                
                JOptionPane.showMessageDialog(Index.getInstance(), "Din önskelista:\n" + text + "\n Har nu skickats till tomten!",
                        "Lucka 18", JOptionPane.INFORMATION_MESSAGE, ikon);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig input");
            }
        }
    }
}