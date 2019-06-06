package tondeuse.view;

import javax.swing.*;
import java.awt.font.TextAttribute;
import java.util.*;
import java.awt.*;
import tondeuse.controller.MenuController;
public class MenuView extends JFrame {

  private JList<String> tutoriels;
  private JButton toggleMenu;
  private JLabel jLabel;

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
    this.jLabel.setBounds((this.getWidth()-165)/2, 10, 165, 40);

    Font font = this.jLabel.getFont();
    Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    this.jLabel.setFont(font.deriveFont(attributes));

    this.toggleMenu = new JButton("\uF183");
    this.toggleMenu.addActionListener(new MenuController(this));
    this.toggleMenu.setFont(new Font("Font Awesome 5 Free", Font.PLAIN, 30));
    this.toggleMenu.setBounds(10,10, 35,35);

    this.add(toggleMenu);
    this.add(jLabel);

    this.setVisible(true);
  }

  public JButton getToggleMenu(){
    return this.toggleMenu;
  }
}
