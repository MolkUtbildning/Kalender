package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag21 {
    public static void Lucka21 () {
        final ImageIcon icon = new ImageIcon(Dag6.class.getResource("/adventskalender1/julskinka.jpg"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "21 December \nIdag ska du få ta reda på arean och omkretsen på din Julskinka ",
                "Lucka 21", JOptionPane.INFORMATION_MESSAGE, icon);
        
        double radie = 0;
        
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Ange din julskinkas radie: ");
                if (s == null)
                    break;

                radie = Double.parseDouble(s);

                if (radie > 0)
                    break;
                else
                    JOptionPane.showMessageDialog(Index.getInstance(), "Radien måste vara större än 0");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), " Felaktig inmatning! ");
            }
        }
        
        double area = Cirkel.arean(radie);
        double omkr = Cirkel.omkrets(radie);
        
        JOptionPane.showMessageDialog(Index.getInstance(), String.format("Arean är %.2f " + "cm2 och Omkretsen är %.2f"
                + " cm ", area, omkr));
    }
}

class Cirkel {
    public static double arean (double r) {
        return Math.PI*r*r;
    }
    
    public static double omkrets (double r) {
        return 2*Math.PI*r;
    }
}