package tondeuse.model;

public class Action extends QuestionAction {
  private String text;
  private String info;

  public Action(String text, String info, int position) {
    super(text, info, position);
  }

  public Action(String text) {
    super(text);
  }
}
