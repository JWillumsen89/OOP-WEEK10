package Day4.Enum;

import java.util.Random;

public class LineBattleRevivedButNotReallyEnum {

  WeaponChoice enemyWeaponChoice() {
    Random random = new Random();
    int choice = random.nextInt(3);
    if (choice == 0)
      return WeaponChoice.BOMB;
    else if (choice == 1)
      return WeaponChoice.SHOOT;
    else if (choice == 2)
      return WeaponChoice.TRAP;
    else
      return null;
    // 0 = Bomb
    // 1 = Shoot
    // 2 = Trap
  }

  public static void main(String[] args) {
    LineBattleRevivedButNotReallyEnum prg = new LineBattleRevivedButNotReallyEnum();
    WeaponChoice weaponChoice;
    weaponChoice = prg.enemyWeaponChoice();

    switch (weaponChoice) {
      case BOMB -> enemyPlaceBomb();
      case SHOOT -> enemyShoot();
      case TRAP -> enemyPlaceTrap();
    }
  }

  private static void enemyPlaceTrap() {
  }

  private static void enemyShoot() {
  }

  private static void enemyPlaceBomb() {
  }
}