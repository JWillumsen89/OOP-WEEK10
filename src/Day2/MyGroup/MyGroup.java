package Day2.MyGroup;


import java.util.Scanner;

public class MyGroup {
  public static void main(String[] args) {
    new MyGroup().go();
  }

  public void go() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of members: ");
    int numOfMem = in.nextInt();
    in.nextLine();

    GroupMembers[] gmArray = new GroupMembers[numOfMem];
    for (int i = 0; i < gmArray.length; i++) {
      gmArray[i] = new GroupMembers();
    }
    System.out.println("\nMembers List: \n");
    for (int j = 0; j < gmArray.length; j++) {
      System.out.println("Member # " + (j + 1) + "\n" + gmArray[j]);
    }


    /*GroupMembers groupMembers1 = new GroupMembers("Jonathan", 12345678, "Jonathan@12345678.dk");
    GroupMembers groupMembers2 = new GroupMembers("Niels", 23456789, "Niels@23456789.dk");
    GroupMembers groupMembers3 = new GroupMembers();
    GroupMembers groupMembers4 = new GroupMembers();

    System.out.println("Group Members: \n");
    System.out.println(groupMembers1);
    System.out.println(groupMembers2);
    System.out.println(groupMembers3);
    System.out.println(groupMembers4);*/
  }
}
