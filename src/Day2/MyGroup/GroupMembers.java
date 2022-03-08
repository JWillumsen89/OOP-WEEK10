package Day2.MyGroup;


import java.util.Scanner;

public class GroupMembers {
  String name;
  String mail;
  int phoneNumber;

  GroupMembers() {
    userInput();
  }

  void userInput(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = in.nextLine();
    System.out.print("Enter phone number: ");
    phoneNumber = in.nextInt();
    in.nextLine();
    System.out.print("Enter mail address: ");
    mail = in.nextLine();
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
