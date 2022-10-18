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
        int grade = Grade.getGrade();
        if (grade > 100) grade = 100;
        int percentage = grade / getNumQuestions() * 100;
        obj.put("course", Course.getCourse());
        obj.put("grade", percentage);
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

    public static void clearLists(){
        names.clear();
        successes.clear();
    }

    public static void addName(String name){
        names.add(name);
    }

    public static void addSuccess(boolean success){
        successes.add(success);
    }

    public static int getNumQuestions() {
        return numQuestions;
    }

    public static void setNumQuestions(int numQuestions) {
        Records.numQuestions = numQuestions;
    }
}
