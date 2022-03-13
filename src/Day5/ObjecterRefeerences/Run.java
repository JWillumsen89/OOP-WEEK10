package Day5.ObjecterRefeerences;

public class Run {

  void go() {
    Car c1 = new Car("VW","ABC");
    Car c2 = c1;

    System.out.println(c1.getRegNo());
    System.out.println(c2.getRegNo());
    c2.setRegNo("DEF");
    System.out.println(c1.getRegNo());
    System.out.println(c2.getRegNo());

    Car[] cars = new Car[4];
    for (int i = 0; i < cars.length ; i++) {

      cars[i] = new Car("VW","I am number " + i);

    }

    System.out.println("Cars:");
    for (int i = 0; i < cars.length; i++) {
      Car currentCar = cars[i];
      System.out.println(currentCar.getRegNo());
      System.out.println(currentCar.getModel());

    }

  }
  public static void main(String[] args) {
    new Run().go();
  }
}
