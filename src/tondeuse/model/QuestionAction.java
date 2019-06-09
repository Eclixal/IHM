package tondeuse.model;

public abstract class QuestionAction {
  protected String text;
  protected String finOuInfo;

  public QuestionAction(String text, String finOuInfo) {
    if((text != null) && (finOuInfo != null)) {
      this.text = text;
      this.finOuInfo = finOuInfo;
    }
  }

  public QuestionAction(String text) {
    if(text != null) {
      this.text = text;
    }
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
}
