package tondeuse.view;

import tondeuse.Tondeuse;
import tondeuse.button.JTexturedButton;
import tondeuse.button.JTexturedWhiteButton;
import tondeuse.controller.TutorielController;
import tondeuse.model.Question;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TutorielView extends JFrame {

    private JButton jButtonClose;
    private JProgressBar jProgressBar;
    private JLabel jLabelEtape;
    private JLabel jLabelEtapeNumber;
    private JLabel jLabelQuestion;
    private JTexturedWhiteButton jTexturedWhiteButtonYes;
    private JTexturedWhiteButton jTexturedWhiteButtonNo;
    private JTexturedButton jTexturedButtonAction;

    private Tondeuse tondeuse;

    public TutorielView(Tondeuse tondeuse) {
        this.tondeuse = tondeuse;
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

        this.jButtonClose = new JButton("X");
        this.jButtonClose.setBounds(20, 20, this.jButtonClose.getPreferredSize().width, this.jButtonClose.getPreferredSize().height);

        this.jProgressBar = new JProgressBar();
        this.jProgressBar.setBounds((this.getWidth()-500)/2, 20, 500, 20);
        this.jProgressBar.setIndeterminate(true);

        this.jLabelEtape = new JLabel("Préparation");
        this.jLabelEtape.setForeground(Color.decode("#707070"));
        this.jLabelEtape.setFont(new Font("Segoe UI", Font.BOLD, 40));
        this.jLabelEtape.setBounds((this.getWidth()-this.jLabelEtape.getPreferredSize().width)/2, 50, this.jLabelEtape.getPreferredSize().width, this.jLabelEtape.getPreferredSize().height);

        this.jLabelEtapeNumber = new JLabel("Etape " + (tondeuse.getEtape()+1));
        this.jLabelEtapeNumber.setForeground(Color.decode("#707070"));
        this.jLabelEtapeNumber.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        this.jLabelEtapeNumber.setBounds((this.getWidth()-this.jLabelEtapeNumber.getPreferredSize().width)/2, 110, this.jLabelEtapeNumber.getPreferredSize().width, this.jLabelEtapeNumber.getPreferredSize().height);

        this.jLabelQuestion = new JLabel(tondeuse.getTutoriel().getActionOrQuestion(tondeuse.getEtape()).getText());
        this.jLabelQuestion.setForeground(Color.decode("#707070"));
        this.jLabelQuestion.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        this.jLabelQuestion.setBounds((this.getWidth()-this.jLabelQuestion.getPreferredSize().width)/2, (this.getHeight()-this.jLabelQuestion.getPreferredSize().height)/2-80, this.jLabelQuestion.getPreferredSize().width, this.jLabelQuestion.getPreferredSize().height);

        if (tondeuse.getTutoriel().getActionOrQuestion(tondeuse.getEtape()) instanceof Question) {
            this.jTexturedWhiteButtonYes = new JTexturedWhiteButton("Oui", "../image/buttonwhite.png", "../image/buttonwhitehover.png");
            this.jTexturedWhiteButtonYes.setBounds((this.getWidth()-150)/2-120, (this.getHeight()-this.jTexturedWhiteButtonYes.getPreferredSize().height)/2+30, 150, this.jTexturedWhiteButtonYes.getPreferredSize().height);
            this.jTexturedWhiteButtonYes.addActionListener(new TutorielController(this));

            this.jTexturedWhiteButtonNo = new JTexturedWhiteButton("Non", "../image/buttonwhite.png", "../image/buttonwhitehover.png");
            this.jTexturedWhiteButtonNo.setBounds((this.getWidth()-150)/2+120, (this.getHeight()-this.jTexturedWhiteButtonNo.getPreferredSize().height)/2+30, 150, this.jTexturedWhiteButtonNo.getPreferredSize().height);
            this.jTexturedWhiteButtonNo.addActionListener(new TutorielController(this));

            this.add(this.jTexturedWhiteButtonYes);
            this.add(this.jTexturedWhiteButtonNo);
        } else {
            this.jTexturedButtonAction = new JTexturedButton("C'est fait !", "../image/button.png", "../image/buttonhover.png");
            this.jTexturedButtonAction.setBounds((this.getWidth()-150)/2, (this.getHeight()-this.jTexturedButtonAction.getPreferredSize().height)/2+30, 150, this.jTexturedButtonAction.getPreferredSize().height);
            this.jTexturedButtonAction.addActionListener(new TutorielController(this));

            this.add(this.jTexturedButtonAction);
        }

        this.add(this.jButtonClose);
        this.add(this.jProgressBar);
        this.add(this.jLabelEtape);
        this.add(this.jLabelEtapeNumber);
        this.add(this.jLabelQuestion);

        this.setVisible(true);
    }

    public JTexturedWhiteButton getjTexturedWhiteButtonYes() {
        return jTexturedWhiteButtonYes;
    }

    public JTexturedWhiteButton getjTexturedWhiteButtonNo() {
        return jTexturedWhiteButtonNo;
    }

    public JTexturedButton getjTexturedButtonAction() {
        return jTexturedButtonAction;
    }

    public Tondeuse getTondeuse() {
        return tondeuse;
    }
}
