package faq;

/**
 * Class for questions and answers with all getters and setters
 * 
 * @author Marko Despotovic
 * @version 13.04.2018.
 */

public class QnA {
  
  private int id;
  private String question;
  private String answer;
  public static int ID_COUNTER = 0;
  
  // Makes a unique id for every question and answer (questions and answers are tied together)
  public QnA(String question, String answer) {
    this(ID_COUNTER++, question, answer);
  }
  
  /**
   * This constructs a question with its answer and gives them an id
   * 
   * @param id
   * @param question
   * @param answer
   */
  public QnA(int id, String question, String answer) {
    super();
    this.id = id;
    this.question = question;
    this.answer = answer;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getQuestion() {
    return question;
  }
  
  public void setQuestion(String question) {
    this.question = question;
  }
  
  public String getAnswer() {
    return answer;
  }
  
  public void setAnswer(String answer) {
    this.answer = answer;
  }
  
}
