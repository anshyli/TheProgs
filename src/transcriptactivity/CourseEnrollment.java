package transcriptactivity;

public class CourseEnrollment {
  
  private String code = "";
  private int credits = 0;
  private char grade = 'N';
  
  public CourseEnrollment(String code, int credits, char grade) {
    this.code = code;
    this.credits = credits;
    this.grade = grade;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public char getGrade() {
    return grade;
  }

  public void setGrade(char grade) {
    this.grade = grade;
  }
  
  public double gradeToGPA() {
    if (grade == 'A') { return 4.0; }
    else if (grade == 'B') { return 3.0; }
    else if (grade == 'C') { return 2.0; }
    else if (grade == 'D') { return 1.0; }
    return 0.0;
  }
  
  @Override
  public String toString() {
    return String.format("%-15s%-12s%-10s%s\n", 
        code, credits, grade, gradeToGPA());
  }
  
}