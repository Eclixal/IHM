package tondeuse.button;

import javax.swing.*;
import java.awt.*;

public class JTexturedWhiteButton extends JButton {

    private static final long serialVersionUID = 1L;

    public JTexturedWhiteButton(String txt, String icon, String iconHover) {
        super(txt);
        setForeground(Color.decode("#707070"));
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
