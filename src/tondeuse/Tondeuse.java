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
    return this.etape;
  }

  public Tutoriel getTutoriel() {
    return tutoriel;
  }

  public void setEtape(int passerA) {
    this.etape = passerA;
  }
}
