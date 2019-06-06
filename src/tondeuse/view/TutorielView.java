package tondeuse.view;

import javax.swing.*;
import java.awt.*;

public class TutorielView extends JFrame {

    public TutorielView() {
        this.setTitle("Tondeuse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();

        setSize(largeur/2,hauteur/2);
        setLocationRelativeTo(null);
        setLayout(null);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.decode("#E6E6E6"));

        this.setPreferredSize(new Dimension(800, 400));
        this.setMinimumSize(new Dimension(800, 400));
        this.setMaximumSize(new Dimension(800, 400));



        this.setVisible(true);
    }

}