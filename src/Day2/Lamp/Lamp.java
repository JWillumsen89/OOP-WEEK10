package Day2.Lamp;

public class Lamp {

  String name;
  boolean lampOff = true;

  Lamp() {
  }

  Lamp(String nameInput) {
    name = nameInput;
  }

  void pushSwitch() {
    if (lampOff == true) {
      //System.out.println("Lamp is switched off!");
      lampOff = false;
    } else if (lampOff == false) {
      // System.out.println("Lamp is switched ooo");
      lampOff = true;
    }
  }

  @Override
  public String toString() {
    if (lampOff == true) {
      return name + " lamp is switched off!";
    } else {
      return name + " lamp is switched on!";
    }
  }
}
