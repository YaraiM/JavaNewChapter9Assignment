package Faculty;

/**
 * 学部という概念を表すインターフェース
 */
public interface Faculty {
  String getDepartment(); //科目を取得するメソッド
  void showRequiredSubject(); //科目を選択するメソッド
}
