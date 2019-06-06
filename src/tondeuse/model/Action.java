package tondeuse.model;

public class Action extends QuestionAction {
  private String text;
  private String info;
  private boolean response;

  public Action(String text, String risque) {
    super(text, fin);
  }

  public Action(String text) {
    super(text);
  }

  public void setResponse(boolean ret) {
    this.response = ret;
  }
}
