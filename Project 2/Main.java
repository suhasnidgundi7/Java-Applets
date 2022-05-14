import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    @Override
    public void paint(Graphics g) {
        /* Squar Inside A Circle */
        g.drawOval(180, 10, 80, 80);
        g.drawRect(192, 22, 55, 55);

        /* Circle Inside a Squar */
        g.drawRect(290, 10, 80, 80);
        g.drawOval(290, 10, 80, 80);
        super.paint(g);
    }

}