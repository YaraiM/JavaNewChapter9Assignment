package Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Dog、Cat、Pigのインスタンス化
    Animal animal1 = new Dog(1, "pochi");
    Animal animal2 = new Cat(5, "tama");
    Animal animal3 = new Pig(3, "boo");

    List<Animal> animalList = new ArrayList<>();
    animalList.add(animal1);
    animalList.add(animal2);
    animalList.add(animal3);

    List<Animal> animalListByAge = animalList.stream()
        .sorted(Comparator.comparingInt(Animal::getAge))
        .toList();

    // Animalのage順にcryメソッドを実行
    for (Animal animal : animalListByAge) {
      animal.cry();
    }

    // Dogクラスを継承したRetrieverクラスのインスタンス化
    Animal animal4 = new Retriever(7, "ken");
    // cryメソッドの実行（Animalインターフェースに定義されているメソッド）
    animal4.cry();
    // actメソッドの実行（Animalインターフェースに定義されていない、Retrieverクラスの固有メソッド）
    // animal4はAnimal型であるため、actメソッドを呼び出すには、キャストによってanimal4がRetriever型であることを明示
    ((Retriever) animal4).act("sit");
    ((Retriever) animal4).act("down");
    ((Retriever) animal4).act("stay");
    ((Retriever) animal4).act("stand");
    ((Retriever) animal4).act("go");
  }
}
