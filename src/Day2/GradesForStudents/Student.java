package Day2.GradesForStudents;

import java.util.Scanner;

public class Student {
  String name;
  int studentNumber;
  int programmingGrade, softwareDevelopGrade, aiGrade, companyGrade,
      itSecurityGrade, appDevelopGrade, developmentGrade;


  Student(String nameInput, int studentNumberInput,
          int programmingGradeInput, int softwareDevelopGradeInput,
          int aiGradeInput, int companyGradeInput,
          int itSecurityGradeInput, int appDevelopGradeInput, int developmentGradeInput) {
    name = nameInput;
    studentNumber = studentNumberInput;
    programmingGrade = programmingGradeInput;
    softwareDevelopGrade = softwareDevelopGradeInput;
    aiGrade = aiGradeInput;
    companyGrade = companyGradeInput;
    itSecurityGrade = itSecurityGradeInput;
    appDevelopGrade = appDevelopGradeInput;
    developmentGrade = developmentGradeInput;
  }
  Student() {
    userInput();
  }

  void userInput() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter name of student: ");
    name = in.nextLine();
    System.out.print("Enter student number: ");
    studentNumber = in.nextInt();
    System.out.print("Enter Programming grade: ");
    programmingGrade = in.nextInt();
    System.out.print("Enter Software Development Grade: ");
    softwareDevelopGrade = in.nextInt();
    System.out.print("Enter AI Grade: ");
    aiGrade = in.nextInt();
    System.out.print("Enter Company Grade: ");
    companyGrade = in.nextInt();
    System.out.print("Enter IT Security Grade: ");
    itSecurityGrade = in.nextInt();
    System.out.print("Enter APP Development Grade: ");
    appDevelopGrade = in.nextInt();
    System.out.print("Enter Development Grade: ");
    developmentGrade = in.nextInt();

  }

  @Override
  public String toString() {
    return "FINAL EXAMS DIPLOMA\n" +
        "For student: \t\t\t\t\t" + name +
        "\nStudent Number: \t\t\t\t" + studentNumber +
        "\n\nProgramming Grade: \t\t\t\t" + programmingGrade +
        "\nSoftware Development Grade: \t" + softwareDevelopGrade +
        "\nAI Grade: \t\t\t\t\t\t" + aiGrade +
        "\nCompany Grade: \t\t\t\t\t" + companyGrade +
        "\nIT Security Grade: \t\t\t\t" + itSecurityGrade +
        "\nAPP Development Grade: \t\t\t" + appDevelopGrade +
        "\nDevelopment Grade: \t\t\t\t" + developmentGrade;
  }
}
