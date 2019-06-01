public class Action {
  private String text;
  private String fin;
  private boolean response;

  public Action(String text, String fin) {
    if((text != null) && (fin != null)) {
      super(text, fin);
    }

    this.response = null;
  }

  public Action(String text) {
    if(text != null) super(text);

    this.response = null;
  }

  public void setResponse(boolean ret) {
    this.response = ret;
  }
}
