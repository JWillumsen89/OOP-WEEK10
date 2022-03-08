package Day2.Dice;

import java.util.Random;

public class Die {
  int faceValue;

  public void roll() {
    Random random = new Random();
    faceValue = random.nextInt(6) + 1;
  }

  int get() {
    return faceValue;
  }

  @Override
  public String toString() {
    return
        "FaceValue: " + faceValue;
  }
}
