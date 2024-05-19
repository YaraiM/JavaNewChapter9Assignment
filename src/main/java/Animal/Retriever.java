package Animal;

/**
 * Dogクラスを継承したRetrieverという実体を表すクラス
 */
public class Retriever extends Dog {
  Retriever(int age, String name) {
    super(age, name);
  }

  public void act(String instruction) {
    switch (instruction) {
      case "sit" -> System.out.println(this.getName() + "座りました");
      case "down" -> System.out.println(this.getName() + "：伏せました");
      case "stay" -> System.out.println(this.getName() + "：待ちます");
      case "stand" -> System.out.println(this.getName() + "：立ちました");
      default -> System.out.println(this.getName() + "：何もしません");
    }
  }
}
