package tondeuse.model;

public class Question extends QuestionAction {
  private String text;
  private String fin;
  private boolean finDuTuto;
  private int passerA;

  public Question(String text, String fin, boolean finDuTuto) {
    super(text, fin);

    if(finDuTuto != null) {
      this.finDuTuto = finDuTuto;
    }
  }

  public Question(String text, boolean finDuTuto, int passerA) {
    super(text);

    if(passerA > 0) {
      this.passerA = passerA;
    }
  }

  public boolean getFinDuTuto() {
    return this.finDuTuto;
  }
}
