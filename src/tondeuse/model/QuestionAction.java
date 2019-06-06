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
      this.finOuInfo = "";
    }
  }

  public String getFinOuInfo() {
    return this.finOuInfo;
  }

  public String toString() {
    return this.text;
  }
}
