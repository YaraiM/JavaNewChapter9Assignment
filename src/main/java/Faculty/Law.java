package Faculty;

/**
 * 法学部という実体を表すクラス
 */
public class Law implements Faculty {
  private String Department;
  private String Subject;

  public Law(String department, String subject) {
    Department = department;
    Subject = subject;
  }

  @Override
  public String getDepartment() {
    return Department;
  }

  public String getSubject() {
    return Subject;
  }

  public void showRequiredSubject() {
    System.out.println(this.Department+ "の必修科目は" + this.Subject + "です");
  }
}
