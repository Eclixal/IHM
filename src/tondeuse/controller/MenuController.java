package tondeuse.controller;
import tondeuse.view.MenuView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuController implements ActionListener{

  private MenuView menu;

  public MenuController(MenuView menu){
    this.menu = menu;
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == this.menu.getToggleMenu()){
      this.menu.getToggleMenu().setVisible(false);
    }
    else{
      this.menu.dispose();
      new TutorielView();
    }
  }
}
