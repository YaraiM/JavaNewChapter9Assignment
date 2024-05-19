package Animal;

/**
 * 豚という実体を表すクラス
 */
public class Pig implements Animal {
  private int age;
  private String name;

  public Pig(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void cry() {
    System.out.println(this.name + "：oink");
  }
}
