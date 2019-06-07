package tondeuse;

import tondeuse.model.Tutoriel;

public class Tondeuse {

  private Tutoriel tutoriel;
  private int etape;

  public Tondeuse() {
    this.tutoriel = new Tutoriel("data/questions.json");
    this.etape = 0;
  }

  public void nextEtape() {
    this.etape++;
  }

  public int getEtape() {
    return etape;
  }

  public Tutoriel getTutoriel() {
    return tutoriel;
  }
}
