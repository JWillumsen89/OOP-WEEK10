package Day3.CarsWithAnAttitude;

public class Car {
  private String brand;
  private String model;
  private String honk;
  private boolean engineOff = true;
  private Driver driver1;

  Car() {
  }

  Car(String brand, String model, String honk) {
    setBrand(brand);
    setModel(model);
    setHonk(honk);
  }

  void setBrand(String brand) {
    this.brand = brand;
  }

  String getBrand() {
    return brand;
  }

  void setModel(String model) {
    this.model = model;
  }

  String getModel() {
    return model;
  }

  void setHonk(String honk) {
    this.honk = honk;
  }

  /*String getHonk() {
    return honk;
  }*/

  /*void setEngineOff() {
    engineOff = true;
  }

  boolean getEngineOff() {
    return engineOff;
  }*/

  void setDriver(Driver insertDriver) {
    driver1 = insertDriver;
  }

  Driver getDriver1() {
    return driver1;
  }

  void engine() {

    if (driver1 != null) {
      if (engineOff == true) {
        engineOff = false;
        System.out.println("Vrruum vrruumm!! engine is running");
      } else if (engineOff == false) {
        engineOff = true;
        System.out.println("Engine is turned off");

      }
    } else {
      System.out.println("There is no driver, you cant turn on the engine");
    }
  }

  void sound() {
    if (driver1 != null) {
      if (engineOff == true) {
        System.out.println(honk + " PLEASE TURN ON ENGINE! YOU ARE DRAINING THE BATTERY!");
      } else if (engineOff == false) {
        System.out.println(honk);
      }
    } else {
      System.out.println("There is no driver, so horn cant be used!");
    }
  }

  void drive() {
    if (driver1 != null) {
      if (engineOff == true) {
        System.out.println(brand + " " + model + " is not moving!! Try starting your engine!!");
      } else if (engineOff == false) {
        System.out.println("LETS GO!! " + brand + " " + model + " is driving!!");
      }
    } else {
      System.out.println("There is no driver, so car cant be driven");
    }
  }

  void park() {
    if (driver1 != null) {
      if (engineOff == true) {
        System.out.println(brand + " " + model + " is parked!!");
      } else if (engineOff == false) {
        System.out.println("Parking car!");
        engine();
        System.out.println(brand + " " + model + " is parked");
      }
    } else {
      System.out.println("There is no driver, so car cant be parked");
    }
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", honk='" + honk + '\'' +
        '}';
  }
}
