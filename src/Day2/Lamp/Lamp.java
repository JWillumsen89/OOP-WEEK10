package Day2.Lamp;

public class Lamp {

  boolean lampOn = true;

  Lamp() {
  }

  void pushSwitch() {
    if (lampOn == true) {
      //System.out.println("Lamp is switched on!");
      lampOn = false;
    } else if (lampOn == false) {
      // System.out.println("Lamp is switched off");
      lampOn = true;
    }
  }

  @Override
  public String toString() {
    if (lampOn == true) {
      return "Lamp is switched on!";
    } else {
      return "Lamp is switched off!";
    }
  }
}
