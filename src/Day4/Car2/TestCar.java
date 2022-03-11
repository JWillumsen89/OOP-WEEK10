package Day4.Car2;

public class TestCar {
  public static void main(String[] args) {
    Car myCar = new Car("VW", "GOLF", "HOOONK HOONK!");
    Driver myDriver = new Driver("Lars");

    myCar.setDriver(myDriver);
    System.out.println("Today our driver is: " + myCar.getDriver().getName());
    myCar.drive();
    myCar.turnEngineOn();
    myCar.drive();
  }
}
