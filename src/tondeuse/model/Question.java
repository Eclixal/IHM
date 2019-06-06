package tondeuse.model;

public class Question extends QuestionAction {
  private String text;
  private String fin;
  private boolean finDuTuto;

  public Question(String text, String fin, boolean finDuTuto) {
    super(text, fin);

    if(finDuTuto != null) {
      this.finDuTuto = finDuTuto;
    }
  }

  public Question(String text, String fin, boolean finDuTuto, String passerA) {
    super(text, fin);

    if(finDuTuto != null) {
      this.finDuTuto = finDuTuto;
    }

    if(passerA != null) {
      
    }
  }

  public boolean getFinDuTuto() {
    return this.finDuTuto;
  }
}
