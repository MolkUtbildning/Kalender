package adventskalender1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Dag14 {
    public static void Lucka14 () {
        final ImageIcon icon = new ImageIcon(Dag14.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "14 December \nIdag ska du få testa och räkna lite ", "Lucka 14",
                JOptionPane.INFORMATION_MESSAGE, icon);

        while (true) {
            try {
                String s = JOptionPane.showInputDialog(Index.getInstance(), "Ange ett tal som du vill räkna: ");

                if (s == null) {
                    JOptionPane.showMessageDialog(Index.getInstance(), "Programmet avslutat");
                    
                    break;
                } else if (s.length() < 1) {
                    JOptionPane.showMessageDialog(Index.getInstance(), "Fältet får ej vara tom");
                    
                    continue;
                }

                s = s.replace(" ", "");
                int i;
                
                for (i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ('+')) {
                        int t1 = Integer.parseInt(s.substring(0, i));
                        int t2 = Integer.parseInt(s.substring(i + 1, s.length()));
                        int total = t1 + t2;
                        
                        JOptionPane.showMessageDialog(Index.getInstance(), +t1 + "+" + t2 + "=" + total);
                        
                    } else if (s.charAt(i) == ('-')) {
                        System.out.println(s.substring(i, i + 1));
                        
                        int t1 = Integer.parseInt(s.substring(0, i));
                        int t2 = Integer.parseInt(s.substring(i + 1, s.length()));
                        
                        System.out.println(t1 - t2);
                        
                        int total = t1 - t2;
                        
                        JOptionPane.showMessageDialog(Index.getInstance(), +t1 + "-" + t2 + "=" + total);
                        
                        break;
                        
                    } else if (s.charAt(i) == ('*')) {
                        System.out.println(s.substring(i, i + 1));
                        
                        double t1 = Double.parseDouble(s.substring(0, i));
                        double t2 = Double.parseDouble(s.substring(i + 1, s.length()));
                        
                        System.out.println(t1 * t2);
                        
                        double total = t1 * t2;
                        
                        JOptionPane.showMessageDialog(Index.getInstance(), +t1 + "*" + t2 + "=" + total);
                        
                        break;
                        
                    } else if (s.charAt(i) == ('/')) {
                        System.out.println(s.substring(i, i + 1));
                        
                        double t1 = Double.parseDouble(s.substring(0, i));
                        double t2 = Double.parseDouble(s.substring(i + 1, s.length()));
                        
                        System.out.println(t1 / t2);
                        
                        double total = t1 / t2;
                        
                        JOptionPane.showMessageDialog(Index.getInstance(), +t1 + "/" + t2 + "=" + total);

                        break;
                        
                    } else if (s.charAt(i) == ('%')) {
                        System.out.println(s.substring(i, i + 1));
                        
                        double t1 = Double.parseDouble(s.substring(0, i));
                        double t2 = Double.parseDouble(s.substring(i + 1, s.length()));
                        
                        System.out.println(t1 % t2);
                        
                        double total = t1 % t2;
                        
                        JOptionPane.showMessageDialog(Index.getInstance(), +t1 + "%" + t2 + "=" + total);
                        
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(Index.getInstance(), "Fel inmatning");
            }
        }
    }
}