package tondeuse.model;

public abstract class QuestionAction implements Comparable<QuestionAction> {
  protected String text;
  protected String finOuInfo;
  protected int position;

  public QuestionAction(String text, String finOuInfo, int position) {
    if((text != null) && (finOuInfo != null)) {
      this.text = text;
      this.finOuInfo = finOuInfo; }
      this.position = position;
  }

  public QuestionAction(String text, int position) {
    if(text != null) {
      this.text = text;
      this.position = position;
    }
  }

  public int getPosition() {
    return position;
  }

  public String getFinOuInfo() {
    return this.finOuInfo;
  }

  public String getText() {
    return text;
  }

  public String toString() {
    return this.text;
  }

  @Override
  public int compareTo(QuestionAction o) {
    return getPosition() - o.getPosition();
  }
}
