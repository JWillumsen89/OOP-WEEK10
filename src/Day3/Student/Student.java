package Day3.Student;

public class Student {
  private String name;
  private String phone;
  private double avgGrade;

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

}

class TestStudent {

  public static void main(String[] args) {
    Student s1 = new Student();
    //s1.name = "Patrick";
  s1.setName("Patrick");
    System.out.println(s1.getName());
    s1.setName("");
    System.out.println(s1.getName());

    s1.setPhone("12 34 56 78");
    System.out.println(s1.getPhone());
  }
}
