package Faculty;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Engineering、Lawのインスタンス化
    Faculty fuculty1 = new Engineering("物理工学科", "物理学");
    Faculty fuculty2 = new Engineering("化学工学科", "化学");
    Faculty fuculty3 = new Law("民法学科", "民法学");
    Faculty fuculty4 = new Law("刑法学科", "刑法学");

    List<Faculty> facultyList = new ArrayList<>();
    facultyList.add(fuculty1);
    facultyList.add(fuculty2);
    facultyList.add(fuculty3);
    facultyList.add(fuculty4);

    // FacultyのshowRequiredSubjectメソッドを実行
    for (Faculty f : facultyList) {
      f.showRequiredSubject();
    }
  }
}
