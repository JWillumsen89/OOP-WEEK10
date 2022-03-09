package Day3.Student;

public class Student {
  private String name;
  private String phone;
  private double avgGrade;
  private int yearOfBirth;

  Student() {}

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

class TestStudent {

  public static void main(String[] args) {
    Student s1 = new Student(2010);
    //s1.name = "Patrick";
    s1.setName("Patrick");
    System.out.println(s1.getName());
    s1.setName("");
    System.out.println(s1.getName());

    s1.setPhone("12 34 56 78");
    System.out.println(s1.getPhone());

    System.out.println("Year: " + s1.getYearOfBirth());

  }
}
