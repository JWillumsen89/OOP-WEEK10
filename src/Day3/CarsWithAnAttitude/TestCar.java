package Day3.CarsWithAnAttitude;

public class TestCar {

  public static void main(String[] args) {
    Car car1 = new Car("Volksvagen", "Passat", "BÅT BÅT!!!");
    Driver dr1 = new Driver("John");

    System.out.println(car1.getBrand() + " " + car1.getModel());
    car1.setDriver(dr1);
    car1.sound();
    car1.drive();
    car1.park();
    car1.engine();
    car1.park();

    System.out.println("Drivers name is: " + dr1.getName());
  }
}
