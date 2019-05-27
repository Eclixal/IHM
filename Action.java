public class Action {
  private String text;
  private boolean response;

  public Question(String text) {
    if(text != null) super(text);

    this.response = null;
  }

  public void setResponse(boolean ret) {
    this.response = ret;
  }
}
