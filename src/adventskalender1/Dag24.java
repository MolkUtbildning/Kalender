package adventskalender1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Created by reinotran on 2015-11-20.
 */
class Dag24 {
    private static AudioClip a;
    public static void Lucka24 () throws MalformedURLException, InterruptedException {
        ImageIcon ikon = new ImageIcon(Dag24.class.getResource("/adventskalender1/julgran.png"));
        
        JOptionPane.showMessageDialog(Index.getInstance(), "24 December\nGod Jul!\n&\nGott Nytt år!\n",
                "Lucka 24", JOptionPane.INFORMATION_MESSAGE, ikon);
        if (a != null)
            a.stop();
        URL u = Dag24.class.getResource("/adventskalender1/jingle1.au");
        a = Applet.newAudioClip(u);
        
        a.play();
    }
}
