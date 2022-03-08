package Day2.SadStudents;

public class Test {
  public static void main(String[] args) {
    new Test().go();
  }

  void go() {

    SadStudent sadStudent1 = new SadStudent("Jonathan");
    sadStudent1.danceLikeCrazy();
    sadStudent1.shoutLikeCrazy();
    sadStudent1.ignoreTeacherInspirationalMoves();
    sadStudent1.lookLikeAZombie();
    sadStudent1.shoutLikeCrazy();
    sadStudent1.danceLikeCrazy();
    sadStudent1.danceLikeCrazy();
    sadStudent1.shoutLikeCrazy();

    SadStudent sadStudent2 = new SadStudent("Niels");
    sadStudent2.danceLikeCrazy();
    sadStudent2.shoutLikeCrazy();
    sadStudent2.danceLikeCrazy();

    System.out.println(sadStudent1);
    System.out.println(sadStudent2);
  }
}
