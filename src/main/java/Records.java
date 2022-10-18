import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Records {

    private static final ArrayList<String> names = new ArrayList<>();
    private static final ArrayList<Boolean> successes = new ArrayList<>();
    private static int numQuestions;

    public Records(){
    }

    public static void save(String course) {
        JSONObject obj = new JSONObject();
        obj.put("course", Course.getCourse());
        obj.put("grade", gradeBugs());
        obj.put("number of questions", getNumQuestions());
        JSONArray list = new JSONArray();
        JSONArray innerList;
        for(int count = 0; count < names.size(); count++){
            innerList = new JSONArray();;
            innerList.add(names.get(count));
            innerList.add(successes.get(count));
            list.add(innerList);
        }
        obj.put("questions", list);
        try {
            FileWriter writer = new FileWriter("records/" + course + "/" + java.time.LocalDateTime.now() + ".json");
            writer.write(obj.toJSONString());
            writer.close();
            clearLists();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int gradeBugs(){
        Grade gde = new Grade();
        int grade = gde.getGrade();
        if (grade > 100) grade = 100;
        int percentage = grade / getNumQuestions() * 100;
        if(percentage < 10) {
            Input input = new Input("Was " + percentage + "% a typo? (y/n)");
            if (input.getInput().equals("y")) {
                Input newGrade = new Input("What was the correct percentage?");
                percentage = Integer.parseInt(newGrade.getInput());
            }
        }
        return percentage;
    }

    private static void clearLists(){
        names.clear();
        successes.clear();
    }

    public void addName(String name){
        names.add(name);
    }

    public void addSuccess(boolean success){
        successes.add(success);
    }

    public static int getNumQuestions() {
        return numQuestions;
    }

    public static void setNumQuestions(int numQuestions) {
        Records.numQuestions = numQuestions;
    }
}
