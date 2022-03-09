package Day2.Lamp;

public class TestMain {
  public static void main(String[] args) {
    new TestMain().go();
  }

  void go() {
    Lamp lamp1 = new Lamp("Living room");
    lamp1.pushSwitch();
    //lamp1.pushSwitch();
    System.out.println(lamp1);

    Lamp lamp2 = new Lamp("Table");
    System.out.println(lamp2);

    Lamp lamp3 = new Lamp();
    System.out.println(lamp3);
  }
}