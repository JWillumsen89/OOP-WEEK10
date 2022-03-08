package Day2.GradesForStudents;

public class TestMain {
  public static void main(String[] args) {
    new TestMain().go();
  }

  void go() {
    Student[] studentArray = new Student[1];
    for (int i = 0; i < studentArray.length; i++) {
      studentArray[i] = new Student();
    }
    for (int j = 0; j < studentArray.length; j++) {
      System.out.println();
      System.out.println(studentArray[j]);

    }

    // Student student1 = new Student("Hans", 1234567, 2, 2, 7, 9, 12, 11, 4);
    //System.out.println(student1);
  }
}
