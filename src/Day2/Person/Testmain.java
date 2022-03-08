package Day2.Person;

public class Testmain {
  public static void main(String[] args) {
    new Testmain().go();
  }

  void go() {
    Person person1 = new Person("Jonathan", 32);

    person1.hasBirthday();

    System.out.println(person1);
  }
}
