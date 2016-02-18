package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag10 {
    public static void Lucka10 () {
        final ImageIcon icon = new ImageIcon(Dag10.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "10 December \nIdag ska du få testa om ditt Julkort håller måttet ",
                "Lucka 10", JOptionPane.INFORMATION_MESSAGE, icon);
        
        double längd = 0;
        double bredd = 0;
        double tjocklek = 0;
        
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Ange Julkortets längd i mm: ");

                if(s == null)
                    break;

                längd = Double.parseDouble(s);

                if (längd > 0)
                    break;
                else 
                    JOptionPane.showMessageDialog(Index.getInstance(), "Längden måste vara större än 0");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), " Felaktig inmatning! ");
            }
        }
        
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Ange julkortets bredd i mm : ");

                if(s == null)
                    break;

                bredd = Double.parseDouble(s);
                
                if(bredd > 0)
                    break;
                else 
                    JOptionPane.showMessageDialog(Index.getInstance(), "Bredden måste vara större än 0");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), " Felaktig inmatning! ");
            }
        }
        
        while (true) {
            try {
                String n = JOptionPane.showInputDialog(Index.getInstance(), "Ange julkortets tjocklek i mm : ");
                
                if(n == null)
                    break;

                tjocklek = Double.parseDouble(n);

                if (tjocklek > 0)
                    break;
                else 
                    JOptionPane.showMessageDialog(Index.getInstance(), "Tjockleken måste vara större än 0");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), " Felaktig inmatning! ");
            }
        }
        if(längd >= 140 && längd <= 600 && bredd >= 90 && tjocklek <= 100 && längd + bredd + tjocklek <= 900)
            JOptionPane.showMessageDialog(Index.getInstance(), "Julkortets mått är ok! ");
        else
            JOptionPane.showMessageDialog(Index.getInstance(), " Tyvärr det är felaktiga mått");
    }
}
