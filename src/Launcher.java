import tondeuse.view.*;

public class Launcher {

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run(){
        new MenuView();
      }
    });

    scenarioTondeuse();
  }

  public static void scenarioTondeuse() {
    // Tondeuse tondeuse = new Tondeuse();
  }


}
