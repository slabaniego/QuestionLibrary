public enum QuestionType {
    // DATA fields
    TRUE_FALSE ("True/False"),
    SHORT_ANSWER ("Short Answer"),
    MULTIPLE_CHOICE ("Multiple Choice");
    private String type;
    
    // Constructor
    private QuestionType(String type){
        this.type = type;
    }

    public String getType(){  
        return type;
    }
}
