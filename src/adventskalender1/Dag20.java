package adventskalender1;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag20 {
    public static void Lucka20 () {
        while (true) {
            try {
                ImageIcon ikon = new ImageIcon(Dag20.class.getResource("/adventskalender1/julgran.png"));
                
                JOptionPane.showMessageDialog(Index.getInstance(), "20 December \n Idag ska du kunna räkna ut medelvärde genom "
                        + "att hämta värden från en annan metod", "Lucka 20", JOptionPane.INFORMATION_MESSAGE, ikon);
                
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Mata in ett tal:");
                
                if (s == null)
                    break;
                
                double a = Double.parseDouble(s);
                
                s = JOptionPane.showInputDialog(Index.getInstance(), "Mata in ett till tal:");
                
                double b = Double.parseDouble(s);
                double mv = medelv(a, b);
                
                JOptionPane.showMessageDialog(Index.getInstance(), "Medelvärdet av de två talen är: " + mv);

            } catch(HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktig inmatning!");
            }
        }         
    }
    
    public static double medelv (double a, double b) {
        return (a+b)/2;
    }
}
