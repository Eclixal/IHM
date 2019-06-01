package tondeuse.model;

public class TutorielTondeuse{

  private ArrayList<QuestionAction> list;

  public TutorielTondeuse(){
    this.list = new ArrayList<QuestionAction>();
    initializeList();
  }

  public QuestionAction getAction(int etape){
    QuestionAction temp = null;

    if((etape >= 0) && (etape < this.list.size())) {
      temp = this.list.get(etape);
    }

    return temp;
  }

  public void interpreterFin(int etape) {
    if((etape >= 0) && (etape < this.list.size())) {
      String temp = this.list.get(etape).getFin();

      if(temp.equalsIgnoreCase("fin")) {

      }

      else if(temp.equalsIgnoreCase("remettre")) {

      }
      else if(temp.equalsIgnoreCase("remettre")) {

      }

    }
  }

  private void initializeList(){
    this.list.add(new Question("L'herbe est-elle déjà coupée ?"));
    this.list.add(new Question("Est-il en train de pleuvoir ?"));
    this.list.add(new Question("L'herbe est-elle mouillée ?"));
    this.list.add(new Action("Sortir la tondeuse du local"));
    this.list.add(new Action("Vérifier le niveau d'essence"));

  }
}
