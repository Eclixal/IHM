import tondeuse.view.*;

import javax.swing.*;

public class Launcher {

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

      public void run(){
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }
        new MenuView();
      }
    });

    scenarioTondeuse();
  }

  public static void scenarioTondeuse() {
    // Tondeuse tondeuse = new Tondeuse();
  }


}
