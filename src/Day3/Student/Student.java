package Day3.Student;

public class Student {
  private String name;
  private String phone;
  private double avgGrade;
  private int yearOfBirth;

  private String lastName;

  Student() {
  }

  Student(String name, String lastName) {
    this.name = name;
    //this. Ved shadowing. Skal bruges når name både er en lokal variable, men også findes i vores attributer og det er den fra attributterne som vil bruges.
    this.lastName = lastName; // Shadowing java kan googles og bruges til hjælp.
  }

  Student(String n) {
    name = n; // DONT: Det er ok ved "betingelsesløs" tilskrivning, men ej når logik.
    setName(n); // Do når der er betingelser. Eller bare hele tiden.
  }

  Student(int y) {
    yearOfBirth = y;

  }

  void setName(String n) {
    if ((!n.equals("")))
      name = n;
    else
      name = "N/A";
  }

  String getName() {
    return name;
  }

  void setPhone(String p) {
    phone = p;
  }

  String getPhone() {
    return phone;
  }

  int getYearOfBirth() {
    return yearOfBirth;
  }
}