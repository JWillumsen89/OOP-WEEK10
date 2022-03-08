package Day2.MyGroup;

import java.util.Scanner;

public class GroupMembers {
  String name;
  String mail;
  int phoneNumber;
  int numOfMem;
  Scanner in = new Scanner(System.in);

  GroupMembers() {
    userInput();
  }

  void userInput() {

    System.out.print("Enter name: ");
    name = in.nextLine();
    System.out.print("Enter phone number: ");
    phoneNumber = in.nextInt();
    in.nextLine();
    System.out.print("Enter mail address: ");
    mail = in.nextLine();
  }

  void numOfMemInput() {
    System.out.println("Enter number of members: ");
    numOfMem = in.nextInt();
  }

  GroupMembers(String nameInput, int phoneNumberInput, String mailInput) {
    name = nameInput;
    mail = mailInput;
    phoneNumber = phoneNumberInput;
  }

  @Override
  public String toString() {
    return
        "Name: " + name +
            "\nMail: " + mail +
            "\nPhoneNumber: +45 " + phoneNumber + "\n";
  }
}
