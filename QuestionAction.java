public abstract class QuestionAction {
  protected String text;
  protected String fin;

  public QuestionAction(String text, String fin) {
    if((text != null) && (fin != null)) {
      this.text = text;
      this.fin = fin;
    }
  }

  public QuestionAction(String text) {
    if(text != null) {
      this.text = text;
      this.fin = "";
    }
  }

  public String getFin() {
    return this.fin;
  }

  public String toString() {
    return this.text;
  }
}
