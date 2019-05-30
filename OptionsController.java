package controller;

public class OptionsController {
  private OptionsView option;

  public OptionsController(OptionsView option) {
    if(option != null) {
      this.option = option;
    }
  }
}
