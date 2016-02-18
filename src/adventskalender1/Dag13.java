package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dag13 {
    public static void Lucka13 () {
        while (true) {
            try {
                ImageIcon ikon = new ImageIcon("C:\\Users\\NiklasAhl\\Downloads\\julgran.png");
                JOptionPane.showMessageDialog(Index.getInstance(), "13 December \n Idag ska vi räkna ut kön utifrån personnummer.",
                        "Lucka 13", JOptionPane.INFORMATION_MESSAGE, ikon);
      
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Personnummer (ååmmdd-nnnn)?");
                    
                if (s == null)
                    break;
                
                switch (s.charAt(9)) {
                    case '0':
                    case '2':
                    case '4':
                    case '6':
                    case '8':
                    JOptionPane.showMessageDialog(Index.getInstance(), "Du är en kvinna");
                        break;
                    case '1':
                    case '3':
                    case '5':
                    case '7':
                    case '9':
                    JOptionPane.showMessageDialog(Index.getInstance(), "Du är en man");
                        break;
                    default:
                    JOptionPane.showMessageDialog(Index.getInstance(), "Felaktigt personnummer");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Felaktigt personnummer");
            }
        }
    }
}