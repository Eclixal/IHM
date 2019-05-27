package tondeuse.view;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class MenuView extends JFrame {

  public MenuView() {
    this.setTitle("Tutoriel tondeuse");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    this.setPreferredSize(new Dimension(1200, 800));
    this.setMinimumSize(new Dimension(1200, 800));
    this.setMaximumSize(new Dimension(1200, 800));

    this.setVisible(true);
  }
}
