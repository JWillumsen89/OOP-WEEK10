package Day4.Car2;

public class Car {
  private String brand;
  private String make;
  private String honk;
  private boolean isOff;
  private Driver driver;

  Car(String brand, String make, String honk) {
    setBrand(brand);
    setMake(make);
    setHonk(honk);
    isOff = true;
  }

  public String getBrand() {
    return brand;
  }

  public Driver getDriver() {
    return driver;
  }

  /*public String getMake() {
    return make;
  }
  public String getHonk() {
    return honk;
  }*/
  public boolean isOff() {
    return isOff;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setHonk(String honk) {
    this.honk = honk;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public void isOff(boolean isOff) {
    this.isOff = isOff;
  }

  public void sound() {
    if (driver != null) {
      System.out.println(honk);
    } else {
      System.out.println("No driver");
    }
  }

  public void drive() {
    if (driver != null) {
      if (isOff == true)
        System.out.println("Turn on engine dumbass!");
      else
        System.out.println(brand + " " + make + " is driving");
    } else {
      System.out.println("No driver!");
    }
  }

  public void park() {
    if (driver != null) {
      System.out.println(brand + " " + make + " is parked");
    } else {
      System.out.println("No driver");
    }
  }

  public void turnEngineOn() {
    if (driver != null) {
      isOff(false);
    } else {
      System.out.println("No driver");
    }
  }

  public void turnEngineOff() {
    if (driver != null) {
      isOff(true);
    } else {
      System.out.println("No driver");
    }
  }
}