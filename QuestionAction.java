public abstract class QuestionAction {
  protected String text;

  public QuestionAction(String text) {
    if(text != null) this.text = text;
  }
}
