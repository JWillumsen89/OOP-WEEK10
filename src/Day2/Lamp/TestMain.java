package Day2.Lamp;

public class TestMain {
  public static void main(String[] args) {
    new TestMain().go();
  }
  void go() {
    Lamp lamp1 = new Lamp();
    lamp1.lampOn = true;
    lamp1.pushSwitch();
    System.out.println(lamp1);
  }

}
