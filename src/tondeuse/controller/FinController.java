package tondeuse.controller;

import tondeuse.view.FinView;
import tondeuse.view.MenuView;
import tondeuse.view.OptionsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinController implements ActionListener {
  private FinView fin;

  public FinController(FinView fin) {
    if(fin != null) {
      this.fin = fin;
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.fin.getjButtonLeave()) {
      System.exit(0);
    } else if (e.getSource() == this.fin.getjButtonMenu()) {
      this.fin.dispose();
      new MenuView();
    }
  }
}
