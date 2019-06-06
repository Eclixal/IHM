package tondeuse.controller;
import tondeuse.view.MenuView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tondeuse.view.OptionsView;
import tondeuse.view.TutorielView;

public class MenuController implements ActionListener{

  private MenuView menu;

  public MenuController(MenuView menu){
    this.menu = menu;
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == this.menu.getToggleMenu()){
      if(!this.menu.getSplit().isVisible()){
        this.menu.getSplit().setVisible(true);
      }
      else{
        this.menu.getSplit().setVisible(false);
      }
    }
    else{
      this.menu.dispose();
      new TutorielView();
    }
  }
}
