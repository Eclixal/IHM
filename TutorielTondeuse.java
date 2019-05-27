package tondeuse.model;

public class TutorielTondeuse{

  private ArrayList<QuestionAction> list;

  public TutorielTondeuse(){
    this.list = new ArrayList<QuestionAction>();
    initializeList();
  }

  public QuestionAction getAction(int etape){
    return this.list.get(etape);
  }

  private void initializeList(){
    this.list.add(new Question("L'herbe est-elle déjà coupée ?"));
    this.list.add(new Question("Est-il en train de pleuvoir ?"));
    this.list.add(new Question("L'herbe est-elle mouillée ?"));
    this.list.add(new Action("Sortir la tondeuse du local"));
    this.list.add(new Action("Vérifier le niveau d'essence"));
  }
}
