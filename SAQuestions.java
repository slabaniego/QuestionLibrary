/*
 * Short Answer Questions class child of Question class
 */
public class SAQuestions extends Question {
    // Data members:
    private String answer;

    // Method members:
    public SAQuestions(){
        super();
        questionType = QuestionType.SHORT_ANSWER;
    }

    public SAQuestions(int questionId, String questionText, String answer){
        super(questionId, questionText);
        this.answer = answer;
        questionType = QuestionType.SHORT_ANSWER;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    @Override
    public boolean isCorrect(Object guess){
        // Casting guess to create a String
        String newGuess = (String)guess;
        if (getAnswer().equalsIgnoreCase(newGuess)){
            System.out.println("Congrats! Your answer is correct.");
            return true;
        } else { 
            System.out.println("Sorry. Your answer is wrong.");
            return false;
        } // End of if-else
    } // End of isCorrect 

    @Override
    public String toString(){
        return super.toString();
    }
}
