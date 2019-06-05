package tondeuse;

public class Question extends QuestionAction {
  private String text;
  private String fin;

  public Question(String text, String fin) {
    super(text, fin);
  }

  public Question(String text) {
    super(text);
  }

}
