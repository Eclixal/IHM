package tondeuse.controller;
import tondeuse.view.MenuView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import tondeuse.view.MenuView;

public class MenuController implements ActionListener{

  private MenuView menu;

  public MenuController(MenuView menu){
    this.menu = menu;
  }

  public void actionPerformed(ActionEvent e){
    this.menu.getToggleMenu().setVisible(false);
  }
}
