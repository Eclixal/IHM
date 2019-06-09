package tondeuse.model;

public class Question extends QuestionAction {
  private String text;
  private String fin;
  private boolean finDuTuto;
  private int passerA;

  public Question(String text, String fin, boolean finDuTuto, int position) {
    super(text, fin, position);
    this.finDuTuto = finDuTuto;
  }

  public Question(String text, boolean finDuTuto, int passerA, int position) {
    super(text, position);

    if(passerA > 0) {
      this.passerA = passerA;
    }
  }

  public int getPasserA() {
    return passerA;
  }

  public boolean getFinDuTuto() {
    return this.finDuTuto;
  }
}
