import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Logs user's stats
 * <h1>Records</h1>
 * @author Francois Boulay-Handfield
 */
public class Records {

    private static final ArrayList<String> names = new ArrayList<>();
    private static final ArrayList<Boolean> successes = new ArrayList<>();
    private static int numQuestions;

    /**
     * Constructor
     * <h1>Records</h1>
     */
    public Records(){
    }

    /**
     * save() handles the logic behind saving a JSON with user data
     * <h1>save</h1>
     * @param course to save logs for
     */
    public static void save(String course) {
        JSONObject obj = new JSONObject();
        obj.put("course", Course.getCourse());
        obj.put("grade", grade());
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
        }
        catch (IOException e){
            e.printStackTrace();
        }
        reset();
    }

    /**
     * <h1>grade</h1>
     * @return the user's grade
     * failsafe mechanisms keep stats stable
     */
    public static int grade(){
        int grade = (int) new Grade().finalGrade();
        if (grade > 100) grade = 100;
        if(grade < 10) {
            Input input = new Input("Was " + grade + "% a typo? (y/n)");
            if (input.getInput().equals("y")) {
                Input newGrade = new Input("What was the correct percentage?");
                grade = Integer.parseInt(newGrade.getInput());
            }
        }
        new Grade().reset();
        return grade;
    }

    /**
     * <h1>reset</h1>
     * resets objects to 0 for the next round
     */
    private static void reset(){
        names.clear();
        successes.clear();
        setNumQuestions(0);
        new Grade().reset();
    }

    /**
     * <h1>addName</h1>
     * @param name adds the question name to the global names ArrayList
     */
    public void addName(String name){
        names.add(name);
    }

    /**
     * <h1>addSuccess</h1>
     * @param success adds whether user was successful
     */
    public void addSuccess(boolean success){
        successes.add(success);
    }

    /**
     * <h1>getNumQuestions</h1>
     * @return gets the total number of questions asked
     */
    public static int getNumQuestions() {
        return numQuestions;
    }

    /**
     * <h1>setNumQuestions</h1>
     * @param numQuestions the number of questions to set
     */
    public static void setNumQuestions(int numQuestions) {
        Records.numQuestions = numQuestions;
    }
}
