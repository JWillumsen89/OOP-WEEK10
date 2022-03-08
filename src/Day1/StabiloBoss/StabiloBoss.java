package Day1.StabiloBoss;

import java.time.LocalDateTime;

public class StabiloBoss {
  String color;
  int thickness;
  int inkLeft;
  int age;
  int yearOfProduction;

  StabiloBoss() {
    System.out.println("CONSTRUCTING STABILO BOSS!!");
  }

  StabiloBoss(int y) {
    yearOfProduction = y;
    calcAge();
  }

  void calcAge() {
    age = LocalDateTime.now().getYear() - yearOfProduction;
  }

  @Override
  public String toString() {
    return "StabiloBoss{" +
        "color='" + color + '\'' +
        ", thickness=" + thickness +
        ", inkLeft=" + inkLeft +
        ", age=" + age +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }


  void writeText(String text) {

    System.out.println("Writing: " + text);
  }
}
