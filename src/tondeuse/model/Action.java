package tondeuse.model;

public class Action extends QuestionAction {
  private String text;
  private String fin;
  private boolean response;

  public Action(String text, String fin) {
    super(text, fin);
  }

  public Action(String text) {
    super(text);
  }

  public void setResponse(boolean ret) {
    this.response = ret;
  }
}