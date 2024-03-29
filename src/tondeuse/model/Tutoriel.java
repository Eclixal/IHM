package tondeuse.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Tutoriel {

  private ArrayList<QuestionAction> list;
  private String fileName;

  public Tutoriel(String fileName){
    if(fileName != null)
      this.fileName = fileName;

    this.list = new ArrayList<QuestionAction>(30);
    this.configure(this.fileName);
  }

  public void configure(String fileName) {
    JSONParser parser = new JSONParser();

    try {
      Object obj = parser.parse(new BufferedReader(new FileReader(fileName)));
      JSONObject jsonObject = (JSONObject) obj;

      JSONArray questions = (JSONArray) jsonObject.get("questions");
      for (Object value : questions) {
        JSONObject question = (JSONObject) value;
        if (question.get("passerA") != null)
          list.add(new Question(question.get("text").toString(), Boolean.parseBoolean(question.get("finDuTuto").toString()), Integer.parseInt(question.get("passerA").toString()),  Integer.parseInt(question.get("position").toString())));
        else
          list.add(new Question(question.get("text").toString(), question.get("fin").toString(), Boolean.parseBoolean(question.get("finDuTuto").toString()),  Integer.parseInt(question.get("position").toString())));
      }

      JSONArray actions = (JSONArray) jsonObject.get("actions");
      for (Object o : actions) {
        JSONObject action = (JSONObject) o;
        list.add(new Action(action.get("text").toString(), action.get("info").toString(),  Integer.parseInt(action.get("position").toString())));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    Collections.sort(this.list);
  }

  public QuestionAction getActionOrQuestion(int etape){
    QuestionAction temp = null;

    if((etape >= 0) && (etape < this.list.size()))
      temp = this.list.get(etape);

    return temp;
  }

  public ArrayList<QuestionAction> getList() {
    return this.list;
  }
}
