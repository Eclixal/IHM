package tondeuse.button;

import javax.swing.*;
import java.awt.*;

public class JTexturedButton extends JButton {

    private static final long serialVersionUID = 1L;

    public JTexturedButton(String txt, String icon, String iconHover) {
        super(txt);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 15));

        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);

        setHorizontalAlignment(SwingConstants.CENTER);
        setHorizontalTextPosition(SwingConstants.CENTER);

        setIcon(new ImageIcon(icon));
        setRolloverIcon(new ImageIcon(iconHover));
    }
}
