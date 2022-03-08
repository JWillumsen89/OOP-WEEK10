package Day2.Person;

public class Person {
  String name;
  int age;

  Person() {}

  Person(String nameInput, int ageInput) {
    name = nameInput;
    age = ageInput;
  }

  public void hasBirthday() {
    age += 1;
  }

  @Override
  public String toString() {
    return "Person: " +
        "\nName: " + name +
        "\nage: " + age;
  }
}
