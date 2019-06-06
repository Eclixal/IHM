package tondeuse.view;

import tondeuse.button.JTexturedButton;

import javax.swing.*;
import java.awt.*;

public class FinView extends JFrame {

    private JLabel jLabelSuccess;
    private JLabel jLabelMessage;
    private JTexturedButton jButtonMenu;
    private JTexturedButton jButtonLeave;

    public FinView(String successText) {
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

        this.jLabelMessage = new JLabel(successText);
        this.jLabelSuccess = new JLabel("Félicitations, vous avez fini le tutoriel !");
        this.jButtonMenu = new JTexturedButton("Retour au menu", "image/button.png", "image/buttonhover.png");
        this.jButtonLeave = new JTexturedButton("Quitter", "image/button.png", "image/buttonhover.png");

        this.jLabelMessage.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        this.jLabelMessage.setForeground(Color.decode("#707070"));
        this.jLabelMessage.setBounds((this.getWidth()-this.jLabelMessage.getPreferredSize().width)/2, (this.getHeight()-this.jLabelMessage.getPreferredSize().height)/2-130, this.jLabelMessage.getPreferredSize().width, this.jLabelMessage.getPreferredSize().height);

        this.jLabelSuccess.setFont(new Font("Segoe UI", Font.BOLD, 30));
        this.jLabelSuccess.setForeground(Color.decode("#707070"));
        this.jLabelSuccess.setBounds((this.getWidth()-this.jLabelSuccess.getPreferredSize().width)/2, (this.getHeight()-this.jLabelSuccess.getPreferredSize().height)/2-50, this.jLabelSuccess.getPreferredSize().width, this.jLabelSuccess.getPreferredSize().height);

        this.jButtonMenu.setBounds((this.getWidth()-this.jButtonMenu.getWidth()-130)/2-120, (this.getHeight())/2+50, 150, this.jButtonMenu.getPreferredSize().height/2);
        this.jButtonLeave.setBounds((this.getWidth()-this.jButtonLeave.getWidth()-130)/2+120,(this.getHeight())/2+50, 150, this.jButtonLeave.getPreferredSize().height/2);

        this.add(this.jLabelMessage);
        this.add(this.jLabelSuccess);
        this.add(this.jButtonMenu);
        this.add(this.jButtonLeave);

        this.setVisible(true);
    }

}