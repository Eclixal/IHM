package tondeuse.view;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class MenuView extends JFrame {

  private JList<String> tutoriels;
  private JButton toggleMenu;
  private JLabel jLabel;

  public MenuView() {
    this.setTitle("Tondeuse");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    this.setPreferredSize(new Dimension(1200, 800));
    this.setMinimumSize(new Dimension(1200, 800));
    this.setMaximumSize(new Dimension(1200, 800));

    this.toggleMenu = new JButton("COUCOU");

    this.add(toggleMenu);

    this.setVisible(true);
  }
}
