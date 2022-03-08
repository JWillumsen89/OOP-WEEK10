package Day2.Dice;

public class TestMain {
  public static void main(String[] args) {
    new TestMain().go();
  }

  void go() {
    Die die1 = new Die();

    int[] statistic = new int[6];

    System.out.println("Dice roll: \n");

    for (int i = 0; i < 100; i++) {
      die1.roll();
      die1.get();
      System.out.println(die1.faceValue);
      switch (die1.faceValue) {
        case 1 -> statistic[0] += 1;
        case 2 -> statistic[1] += 1;
        case 3 -> statistic[2] += 1;
        case 4 -> statistic[3] += 1;
        case 5 -> statistic[4] += 1;
        case 6 -> statistic[5] += 1;
      }
    }

    for (int j = 0; j < 6; j++) {
      System.out.println("You rolled " + (j + 1) + " :" + statistic[j]);

    }
  }
}

