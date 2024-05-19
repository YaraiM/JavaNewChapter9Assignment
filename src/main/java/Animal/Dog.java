package Animal;

/**
 * 犬という実体を表すクラス
 */
public class Dog implements Animal {
  private int age;
  private String name;

  public Dog(int age, String name) {
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
    System.out.println(this.name + "：bow wow");
  }
}
