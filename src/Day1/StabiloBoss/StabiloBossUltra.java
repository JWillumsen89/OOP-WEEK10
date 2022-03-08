package Day1.StabiloBoss;

public class StabiloBossUltra {
  void go() {
    // StabiloBossProgram prg = new StabiloBossProgram();
    StabiloBoss marker = new StabiloBoss();
    StabiloBoss marker2 = new StabiloBoss();
    marker.color = "Dove blue";
    marker.thickness = 34;
    System.out.println(marker.color);
    System.out.println(marker.thickness);

    marker2.color = "Sun yellow";
    System.out.println("MARKER 2: " + marker2.color);

    marker.writeText("My cool text");
    marker2.writeText("My fancy text");

    // toString

    System.out.println("toString():\n" + marker);

    // Konstruktør

    StabiloBoss constMarker = new StabiloBoss(2018);
    // constMarker.yearOfProduction = 2018;
    // constMarker.calcAge();
    System.out.println(constMarker.age);

  }

  public static void main(String[] args) {
    new StabiloBossUltra().go();
  }
}