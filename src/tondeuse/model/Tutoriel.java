package tondeuse.model;

import java.util.ArrayList;

public class Tutoriel{

  private ArrayList<QuestionAction> list;
  private String fileName;

  public Tutoriel(String fileName){
    if(fileName != null) {
      this.fileName = fileName;
    }

    this.list = new ArrayList<QuestionAction>();
    this.configure(this.fileName);
  }

  public void configure(String fileName) {
//    // parsing file "JSONExample.json"
//    Object obj = new JSONParser().parse(new FileReader(fileName));
//
//    // typecasting obj to JSONObject
//    JSONObject jo = (JSONObject) obj;
//
//    // getting firstName and lastName
//    String firstName = (String) jo.get("firstName");
//    String lastName = (String) jo.get("lastName");
//
//    System.out.println(firstName);
//    System.out.println(lastName);
//
//    // getting age
//    long age = (long) jo.get("age");
//    System.out.println(age);
//
//    // getting address
//    Map address = ((Map)jo.get("address"));
//
//    // iterating address Map
//    Iterator<Map.Entry> itr1 = address.entrySet().iterator();
//    while (itr1.hasNext()) {
//        Map.Entry pair = itr1.next();
//        System.out.println(pair.getKey() + " : " + pair.getValue());
//    }
//
//    // getting phoneNumbers
//    JSONArray ja = (JSONArray) jo.get("phoneNumbers");
//
//    // iterating phoneNumbers
//    Iterator itr2 = ja.iterator();
//
//    while (itr2.hasNext())
//    {
//        itr1 = ((Map) itr2.next()).entrySet().iterator();
//        while (itr1.hasNext()) {
//            Map.Entry pair = itr1.next();
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//    }
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
      String temp = this.list.get(etape).getFinOuInfo();

      if(temp.equalsIgnoreCase("fin")) {

      }

      else if(temp.equalsIgnoreCase("remettre")) {

      }
      else if(temp.equalsIgnoreCase("remettre")) {

      }

    }
  }

  /* private void initializeList(){
    this.list.add(new Question("L'herbe est-elle déjà coupée ?"));
    this.list.add(new Question("Est-il en train de pleuvoir ?"));
    this.list.add(new Question("L'herbe est-elle mouillée ?"));
    this.list.add(new Action("Sortir la tondeuse du local"));
    this.list.add(new Action("Vérifier le niveau d'essence"));

  } */


}
