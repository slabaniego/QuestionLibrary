/* 
 * Question class is the abstract super class 
 */
public abstract class Question {
    // Data members:
    private int questionId;
    private String questionText;
    protected QuestionType questionType;

    // Method members:
    public Question(){ // constructor if data fields are not set
        questionId = 0; 
        questionText = "TBD"; 
    }
    public Question(int questionId, String questionText){ // 
        this.questionId = questionId;
        this.questionText = questionText;
    }

    public int getQuestionId(){
        return questionId;
    }

    public void setQuestionId(int questionId){
        this.questionId = questionId;
    }

    public String getQuestionText(){
        return questionText;
    }

    public void setQuestionText(String questionText){
        this.questionText = questionText;
    }

    // Abstract method followed by subclasses
    public abstract boolean isCorrect(Object guess); 

    // if else statements to print out prompts if empty/invalid data fields used. 
    public String toString(){
        String text;
        if (questionText.equals("TBD") && questionId < 1){
            text = "No question text entered and invalid question ID number.";
        } else if (questionText.equals("TBD") && questionId > 0) {
            text = "#" + getQuestionId() + " No question text entered. Enter question.";
        } else if (questionId < 1 && !(questionText.equals("TBD"))) {
            text = "invalid question ID number. " + getQuestionText();
        } else {
            text = "#" + getQuestionId() + ": " + getQuestionText();
        } 
        return text;
    } // End of toString
} // End of Question class
