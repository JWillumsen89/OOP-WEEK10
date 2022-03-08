package Day2.SadStudent;

public class SadStudent {
  String name;
  int levelOfEngagement = 0;
  int expectedExamGrade = 0;

  SadStudent() {
  }

  SadStudent(String nameInput) {

    name = nameInput;
  }

  public void danceLikeCrazy() {
    levelOfEngagement += 10;
    expectedExamGrade += 1;
  }

  public void shoutLikeCrazy() {
    levelOfEngagement += 10;
    expectedExamGrade += 1;
  }

  public void lookLikeAZombie() {
    levelOfEngagement -= 10;
    expectedExamGrade -= 1;
  }

  public void ignoreTeacherInspirationalMoves() {
    levelOfEngagement -= 10;
    expectedExamGrade -= 1;
  }

  @Override
  public String toString() {
    if (levelOfEngagement > 30) {
      return "Sad Student:\n" +
          "Name: \t\t\t\t\t" + name +
          "\nLevel Of Engagement: \t" + levelOfEngagement +
          "\nExpected Exam Grade: \t" + expectedExamGrade + "\n" + "\n\"YEAH!! YOU ROCK!!!\"\n";
    } else {
      return "Sad Student:\n" +
          "Name: \t\t\t\t\t" + name +
          "\nLevel Of Engagement: \t" + levelOfEngagement +
          "\nExpected Exam Grade: \t" + expectedExamGrade + "\n" + "\n\"YOU NEED TO ENGAGE MORE!!!\"\n";
    }
  }
}
