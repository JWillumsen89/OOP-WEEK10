package Day1.HappyKid;

import java.time.LocalDateTime;

public class Kid {
  String name;
  int yearOfBirth;
  int age;
  String favColor;

  Kid(){

  }

  Kid(String nameInput, int yearOfBirthInput, String favCol) {
    name = nameInput;
    yearOfBirth = yearOfBirthInput;
    favColor = favCol;

  }

  public void calcAge() {
    age = LocalDateTime.now().getYear() - yearOfBirth;

  }
  @Override
  public String toString() {
    return "Kid: " +
        "\nName: " + name +
        "\nYear Of Birth: " + yearOfBirth + "\nAge: " + age + "\nFavorite color: " + favColor + "\n";
  }
}

