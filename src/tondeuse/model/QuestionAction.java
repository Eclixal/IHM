package tondeuse.model;

public abstract class QuestionAction {
  protected String text;
  protected String finOuInfo;
  protected int position;

  public QuestionAction(String text, String finOuInfo, int position) {
    if((text != null) && (finOuInfo != null) && (position >= 0)) {
      this.text = text;
      this.finOuInfo = finOuInfo;
      this.position = position;
    }
  }

  public QuestionAction(String text, int position) {
    if((text != null) && (position >= 0)) {
      this.text = text;
      this.position = position;
    }
  }

  public QuestionAction(String text, String finOuInfo) {
    if((text != null) && (finOuInfo != null)) {
      this.text = text;
      this.finOuInfo = finOuInfo;
    }
  }

  public QuestionAction(String text) {
    if(text != null) {
      this.text = text;
      this.finOuInfo = "";
    }
  }

  public String getFinOuInfo() {
    return this.finOuInfo;
  }

  public int getPosition() {
    return position;
  }

  public String getText() {
    return text;
  }

  public String toString() {
    return this.text;
  }
}
