package tondeuse.button;

import javax.swing.*;
import javax.swing.plaf.ProgressBarUI;
import java.awt.*;

public class JTexturedProgressBar extends JProgressBar {

    private static final long serialVersionUID = 1L;

    public JTexturedProgressBar() {
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 15));

        setOpaque(false);
        setBorderPainted(false);

        setUI(new ProgressBarUI() {
            Rectangle r = new Rectangle();

            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                r = getBounds(r);
                g.setColor(getForeground());
                g.fillOval(r.x, r.y, r.width, r.height);
            }
        });
    }
}
