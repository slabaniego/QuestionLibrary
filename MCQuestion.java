
import java.util.Arrays;

public class MCQuestion extends Question {
    private char answer;
    private String[] options;

    // constructors
    public MCQuestion(){
        questionType = QuestionType.MULTIPLE_CHOICE;
    }

    public MCQuestion(int questionId, String questionText, char answer, String... options){
        super(questionId, questionText);
        this.answer = answer;
        this.options = options;
        questionType = QuestionType.MULTIPLE_CHOICE;
    }

    public char getAnswer(){
        return answer;
    }

    public void setAnswer(char answer){
        this.answer = answer;
    }

    // Decide to return object or Array of String 
    public String[] getOptions(){ // Returns the string array 
        return options;
    }

    public void setOptions(String... options){
        // String[] newOptions = new String [options.size()];
        // options.toArray(newOptions);
        this.options = options;
    }

    @Override
    public boolean isCorrect(Object guess){
        char newGuess = (char)guess;
        if(newGuess == getAnswer()){
            System.out.println("You are correct!");
            return true;
        } else {
            System.out.println("Sorry, your answer is wrong.");
            return false;
        }
    }

    public String toString(){
        return super.toString() + Arrays.toString(getOptions()).replace(",", " ").replace("[",",").replace("]",",").replace(",", " ");
    }

}