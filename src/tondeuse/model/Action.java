package tondeuse.model;

public class Action extends QuestionAction {
  private String text;
  private String info;

  public Action(String text, String info) {
    super(text, info);
  }

  public Action(String text) {
    super(text);
  }
}
