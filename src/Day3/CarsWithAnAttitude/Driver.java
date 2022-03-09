package Day3.CarsWithAnAttitude;

public class Driver {
  private String name;

  void setName(String nameInput) {
    name = nameInput;
  }
  String getName() {
    return name;
  }
  Driver() {}

  Driver(String nameInput) {
    setName(nameInput);
  }
}
