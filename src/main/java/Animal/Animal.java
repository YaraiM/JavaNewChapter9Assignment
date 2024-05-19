package Animal;

/**
 * 動物という概念を表すインターフェース
 */
public interface Animal {
  int getAge(); //年齢を取得するメソッド
  String getName(); //氏名を取得するメソッド
  void cry(); //鳴き声を発するメソッド
}
