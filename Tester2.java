import java.util.Scanner;

// import java.util.ArrayList;
public class Tester2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Testing short answer questions with and without data fields. */
        // short answer 1
        SAQuestions shortAQ1 = new SAQuestions(1, "Who invented Java? ", "James Gosling");
        /* Adding to question list   */
        QuestionList quest1 = new QuestionList(shortAQ1);

        // short answer 2
        SAQuestions shortAQ2 = new SAQuestions();
        shortAQ2.setQuestionId(2);
        shortAQ2.setQuestionText("Which of these data types requires the most amount of memory?\nbyte, short, or long\n");
        shortAQ2.setAnswer("long");
        /* Adding to question list */
        QuestionList quest2 = new QuestionList(shortAQ2);

      
    
        // T or F #1
        TFQuestion trueFalseQ1 = new TFQuestion(3, "Java is an object-oriented programming language.\n", true);
        QuestionList quest3 = new QuestionList(trueFalseQ1);
    
        // T or F #2
        TFQuestion trueFalseQ2 = new TFQuestion();  
        trueFalseQ2.setQuestionId(4);
        trueFalseQ2.setQuestionText("To declare a constant variable in Java, use lower case to name the variable.\n");
        trueFalseQ2.setAnswer(false);
        QuestionList quest4 = new QuestionList(trueFalseQ2);

        // MC Question #1 
        MCQuestion multiChoice1 = new MCQuestion(5, "_______ is not an object-oriented programming language", 'c', "\na. Java", "\nb. Ruby", "\nc. C", "\nd. Python\n");
        QuestionList quest5 = new QuestionList(multiChoice1);

        MCQuestion multiChoice2 = new MCQuestion(6, "The extension name of a java byte code is", 'a', "\na).class", "\nb).java", "\nc).byte", "\nd).txt\n");
        QuestionList quest6 = new QuestionList(multiChoice2);

        
        /* Testing starts here */
        char select1 = ' ';
        int select2 = -1;
        while (!(select1 == 'E' || select1 == 'e')){
            System.out.println("Choose an Option:\n(A)dd a Question\n(B)egin quiz\n(E)xit program\n");
            select1 = input.next().charAt(0);

            if (select1 == 'A' || select1 == 'a'){ // If user chooses to add a question
                // Asking for user input to choose type of question
                System.out.println("Choose a question type by number:"
                   + "\n1.True/False\n2.Short Answer\n3.Multiple-Choice");
                   select2 = input.nextInt();
                   switch(select2) {
                    // True or false 
                        case 1: 
                            System.out.println("Question ID: ");
                            int idUser1 = input.nextInt();


                            // Recalling scanner to reset input line
                            input = new Scanner(System.in);
                            System.out.println("Question text: ");
                            String textUser1 = input.nextLine();
                            System.out.println("Answer: ");
                            Boolean answerUser1 = input.nextBoolean();
                             // Asking user for Answer key in do while 
                            while (!(answerUser1 instanceof Boolean)){
                                System.out.print("Please try again. Enter true or false");
                                answerUser1 = input.nextBoolean();
                            }
                                    
                            TFQuestion tFQ = new TFQuestion(idUser1, textUser1, answerUser1);
                            QuestionList tUser1 = new QuestionList(tFQ);
                            
                            // System.out.println(tUser1.toString());
                            break;
                    // Short answer
                        case 2: 
                            System.out.println("Question ID: ");
                            int idUser2 = input.nextInt();
                            
                            input = new Scanner(System.in);
                            System.out.println("Question text: ");
                            String textUser2 = input.nextLine();

                            input = new Scanner(System.in);
                            System.out.println("Answer: ");
                            String answerUser2 = input.nextLine();
                            SAQuestions sAQ = new SAQuestions(idUser2, textUser2, answerUser2);
                            QuestionList tUser2 = new QuestionList(sAQ);

                            // System.out.println(tUser2.getQuestionText());
                            break;
                    // MC Question
                        case 3:
                            System.out.println("Question ID: ");
                            int idUser3 = input.nextInt();
                            
                            input = new Scanner(System.in);
                            System.out.println("Question text: ");
                            String textUser3 = input.nextLine();

                            // Options
                            input.nextLine();
                            System.out.println("Enter the Multiple Choice Options: ");
                            String[] optUser3 = new String[4];
                            input.nextLine();
                            for (char option = 'a'; option < optUser3.length; option++){
                                System.out.print("Enter option: " + option);
                                optUser3[option - 'a'] = input.nextLine();
                            }
                        
                            System.out.println("Enter letter for answer: ");
                            char answerUser3 = input.next().charAt(0);
                            MCQuestion tUser3 = new MCQuestion(idUser3, textUser3, answerUser3, optUser3);
                            System.out.println(tUser3.getOptions());
                            break;
                        default:
                            System.out.println("none selected");
                            break;
                   }
            } else if (select1 == 'B' || select1 == 'b'){ // If user chooses to do the quiz
                System.out.println("Choose a question type by number:"
                    + "\n1. True/False\n2. Short Answer\n3. Multiple-Choice");
                select2 = input.nextInt();
                input.nextLine(); // Consume the newline character
                if (select2 == 1){
                    System.out.println("Question ID: ");
                    int id1 = input.nextInt();
                    System.out.print(trueFalseQ1.toString());
                    // quest3.presentQuestion(id1);
                    System.out.println("Enter answer: ");
                    boolean userAns1 = input.nextBoolean();
                    trueFalseQ1.isCorrect(userAns1); 
                } else if (select2 == 2){
                    System.out.println("Question ID: ");
                    int id2 = input.nextInt();
                    System.out.print(shortAQ1.toString());
                    // quest3.presentQuestion(id1);
                    input.nextLine();
                    System.out.println("Enter answer: ");
                    String userAns2 = input.nextLine();
                    shortAQ1.isCorrect(userAns2); 
                }
                    System.out.println("Question ID: ");
                    int id3 = input.nextInt();
                    multiChoice1.getQuestionText();
                    System.out.print(multiChoice1.toString());
                    // quest3.presentQuestion(id1);
                    input.nextLine();
                    System.out.print("Enter answer: ");
                    char userAns2 = input.next().charAt(0);
                    multiChoice1.isCorrect(userAns2); 
                
            } else { // If user ends program 
                System.out.println("Program ended. Thank you for your time!");
            }
        } // End of while loop
    }  // End of main method
} // End of class header 
