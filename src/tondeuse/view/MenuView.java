package tondeuse.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.font.TextAttribute;
import java.util.*;
import java.awt.*;
import tondeuse.controller.MenuController;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class MenuView extends JFrame {

  private JList<String> tutoriels;
  private JButton toggleMenu;
  private JLabel jLabel;
  private JButton tondeuse;
  private JSplitPane split;

  public MenuView() {
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

    this.jLabel = new JLabel("Tutoriels");
    this.jLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
    this.jLabel.setBounds((this.getWidth()-this.jLabel.getPreferredSize().width)/2, 10, this.jLabel.getPreferredSize().width, this.jLabel.getPreferredSize().height);

    Font font = this.jLabel.getFont();
    Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    this.jLabel.setFont(font.deriveFont(attributes));

    this.toggleMenu = new JButton("\uF183");
    this.toggleMenu.addActionListener(new MenuController(this));
    this.toggleMenu.setFont(new Font("Font Awesome 5 Free", Font.PLAIN, 30));
    this.toggleMenu.setBounds(10,10, 35,35);

    ImageIcon imageTondeuse = new ImageIcon(new ImageIcon("image/tondeuse.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    this.tondeuse = new JButton(imageTondeuse);
    this.tondeuse.setBorderPainted(false);
    this.tondeuse.setFocusPainted(false);
    this.tondeuse.setBounds((this.getWidth()-this.tondeuse.getPreferredSize().width)/2,(this.getHeight()-this.tondeuse.getPreferredSize().height)/2,this.tondeuse.getPreferredSize().width,this.tondeuse.getPreferredSize().height);
    this.tondeuse.addActionListener(new MenuController(this));

    this.split = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    JButton tutoriels = new JButton("Tutoriels");
    tutoriels.setPreferredSize(new Dimension(150,35));
    JButton parametres = new JButton("Paramètres");
    parametres.setPreferredSize(new Dimension(150,35));
    JButton retour = new JButton("Retour");
    retour.setPreferredSize(new Dimension(150,35));
    JButton quitter = new JButton("Quitter");
    quitter.setPreferredSize(new Dimension(150,35));
    JPanel panel1 = new JPanel();
    FlowLayout flow1 = new FlowLayout();
    panel1.setLayout(flow1);
    panel1.add(tutoriels);
    panel1.add(parametres);
    panel1.add(retour);
    panel1.add(quitter);
    split.setLeftComponent(panel1);
    JButton contact = new JButton("Contact");
    contact.setPreferredSize(new Dimension(150,30));
    JButton aPropos = new JButton("A propos");
    aPropos.setPreferredSize(new Dimension(150,30));
    JPanel panel2 = new JPanel();
    FlowLayout flow2 = new FlowLayout();
    panel2.setLayout(flow2);
    panel2.add(contact);
    panel2.add(aPropos);
    split.setRightComponent(panel2);
    this.split.setBounds(10,50,200,310);
    this.split.setDividerLocation(0.60);
    this.split.setVisible(false);

    this.add(toggleMenu);
    this.add(jLabel);
    this.add(tondeuse);
    this.add(split);

    this.setVisible(true);
  }

  public JButton getToggleMenu(){
    return this.toggleMenu;
  }

  public JSplitPane getSplit(){
    return this.split;
  }
}

