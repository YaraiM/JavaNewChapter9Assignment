package Animal;

/**
 * 猫という実体を表すクラス
 */
public class Cat implements Animal {
  private int age;
  private String name;

  public Cat(int age, String name) {
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
    System.out.println(this.name + "：meow");
  }
}
