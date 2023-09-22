import java.util.ArrayList;
/* 
if extends Question no ArrayList, abstract method is needed 
to be defined here but not necessary nor used in this class.
*/
public class QuestionList extends ArrayList<Question>{

    // Creating variable questList to store, add, remove, get questions from Question class
    // ArrayList<Question> questList = new ArrayList<Question>();

    public QuestionList(){
    }

    public QuestionList(Question... q) {// Method to store and add questions randomly regardless of type 
        for (int a = 0; a < q.length; a++) {
            add(q[a]);
        }
    }

    public String presentQuestion(int index){
        if (index >= 0 && index < this.size()) {
            Question question = this.get(index);
            return question.toString(); //+ question.toString();
        } else {
            return null; // Invalid index, return null
        }
    }
}