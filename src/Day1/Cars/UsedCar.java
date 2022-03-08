package Day1.Cars;

import java.time.LocalDateTime;

public class UsedCar {
  String brand;
  String model;
  String color;
  String condition;
  int modelYear;
  int km;
  int age;

  UsedCar(int y) {
    modelYear = y;
    calcAge();
  }

  public void calcAge() {
    age = LocalDateTime.now().getYear() - modelYear;
  }

  UsedCar() {
  }

  UsedCar(String brandInput, String modelInput, String colorInput, String conditionInput, int modelYearInput, int kmInput) {
    brand = brandInput;
    model = modelInput;
    color = colorInput;
    condition = conditionInput;
    modelYear = modelYearInput;
    km = kmInput;
  }

  @Override
  public String toString() {
    return
        "\nBrand: \t\t" + brand +
        "\nModel: \t\t" + model +
        "\nColor: \t\t" + color +
        "\nCondition: \t" + condition +
        "\nModelYear: \t" + modelYear +
        "\nKm: \t\t" + km +
        "\nAge: \t\t" + age + "\n";
  }
}
