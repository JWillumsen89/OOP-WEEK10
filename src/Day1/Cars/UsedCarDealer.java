package Day1.Cars;

public class UsedCarDealer {
  public static void main(String[] args) {
    new UsedCarDealer().go();
  }

  void go() {

    UsedCar usedCar1 = new UsedCar("Mazda", "CX-3", "Metallic Blue", "Average", 2010, 236589);
    UsedCar usedCar2 = new UsedCar("Ford", "Mondeo", "Moon Black", "Good", 2019, 73652);
    UsedCar usedCar3 = new UsedCar("Skoda", "Enyaq", "Artic Silver", "Mint", 2020, 6574);
    UsedCar usedCar4 = new UsedCar("Mercedes", "E-Class", "Phantom Grey", "Mint", 2021, 3456);
    UsedCar usedCar5 = new UsedCar("Kia", "Cee'd", "Green", "Average", 2004, 345862);
    UsedCar usedCar6 = new UsedCar("Toyota", "Supra", "White", "Good", 1994, 10358);
    UsedCar usedCar7 = new UsedCar("Dogde", "Viper", "Red with white Racing Stripes", "Mint", 1998, 50496);
    UsedCar usedCar8 = new UsedCar("Ferrari", "Testarossa", "Red", "Mint", 1992, 2360);

    usedCar1.calcAge();
    usedCar2.calcAge();
    usedCar3.calcAge();
    usedCar4.calcAge();
    usedCar5.calcAge();
    usedCar6.calcAge();
    usedCar7.calcAge();
    usedCar8.calcAge();

    System.out.println("Used Cars: \n");
    System.out.println(usedCar1);
    System.out.println(usedCar2);
    System.out.println(usedCar3);
    System.out.println(usedCar4);
    System.out.println(usedCar5);
    System.out.println(usedCar6);
    System.out.println(usedCar7);
    System.out.println(usedCar8);

  }

}
