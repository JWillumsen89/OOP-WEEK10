package Day3.Student;

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
