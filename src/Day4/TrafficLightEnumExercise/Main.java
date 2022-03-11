package Day4.TrafficLightEnumExercise;

public class Main {

  public void go() {

    TrafficLight tl = new TrafficLight(TrafficLightColor.GREEN);
    System.out.println(tl);
    tl.setColor(TrafficLightColor.YELLOW);
    System.out.println(tl);
    tl.setColor(TrafficLightColor.RED);
    System.out.println(tl);
  }

  public static void main(String[] args) {
    new Main().go();
  }
}
