/*
 * True of False Question class child of Question class
 */

public class TFQuestion extends Question {
    // Data Members
    private boolean answer;

    // Method members
    public TFQuestion(){
        super();
        questionType = QuestionType.TRUE_FALSE;
    }
    public TFQuestion(int questionId, String questionText, boolean answer){
        super(questionId, questionText);
        this.answer = answer;
        questionType = QuestionType.TRUE_FALSE;
    }

    public boolean isAnswer(){
        return answer;
    }

    public void setAnswer(boolean answer){
        this.answer = answer;
    }

    @Override
    public boolean isCorrect(Object guess){
        // if block to let programmer use boolean as a data type when creating answer
        if (guess instanceof Boolean){
            if (guess.equals(isAnswer())){
                System.out.println("Congrats your answer is right!");
            } else {
                System.out.println("Sorry. Your answer is wrong.");
            }
            return true;
            // end of outer if statement

        // else if to let programmer use String when creating answer
        } else if (guess instanceof String){

            // casting guess to String to useSt ring method .equalsIgnoreCase
            String newGuess = (String)guess;

            // casting isAnswer() to a String so compatible with newGuess
            String newAnswer = String.valueOf(isAnswer());
            if (newGuess.equalsIgnoreCase("true") || newGuess.equalsIgnoreCase("false")){
                if (newGuess.equalsIgnoreCase(newAnswer))
                    System.out.println("Congrats your answer is right!");
                else 
                    System.out.println("Sorry. Your answer is wrong.");
        
            // else if statement to check if input passed by user is not a true or false
            } else if (!(newGuess.equalsIgnoreCase(newAnswer) && !(newGuess.equalsIgnoreCase(newAnswer)))){
                System.out.println("Wrong input. Please try true or false.");
                return false;
            } 
            return true;
            // end of else if statement
        } else 
            return false;
    }

    @Override
    public String toString(){
        return super.toString() + "[true or false?]\n"; // uses superclass toString and adds true or false
    }
}
