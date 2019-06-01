public class Question {
  private String text;
  private String fin;

  public Question(String text, String fin) {
    if((text != null) && (fin != null)) {
      super(text, fin);
    }
  }

  public Question(String text) {
    if(text != null) super(text);
  }

}
