package Day1.HappyKid;

public class Test {

  public static void main(String[] args) {
    new Test().go();
  }

  void go() {
    Kid kid1 = new Kid();
    Kid kid2 = new Kid();
    Kid kid3 = new Kid();
    Kid kid4 = new Kid();
    Kid kid5 = new Kid();
    Kid kid6 = new Kid("Niels", 1987, "Green");

    kid1.name = "Jens";
    kid2.name = "Hanne";
    kid3.name = "Mogens";
    kid4.name = "Karen";
    kid5.name = "Hans";

    kid1.yearOfBirth = 1965;
    kid2.yearOfBirth = 1947;
    kid3.yearOfBirth = 1982;
    kid4.yearOfBirth = 1998;
    kid5.yearOfBirth = 2010;

    kid1.calcAge();
    kid2.calcAge();
    kid3.calcAge();
    kid4.calcAge();
    kid5.calcAge();

    kid1.favColor = "Green";
    kid2.favColor = "Yellow";
    kid3.favColor = "Blue";
    kid4.favColor = "Purple";
    kid5.favColor = "Red";

    System.out.println(kid1);
    System.out.println(kid2);
    System.out.println(kid3);
    System.out.println(kid4);
    System.out.println(kid5);
    System.out.println(kid6);
  }
}
