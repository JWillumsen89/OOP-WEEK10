package Day2.MyGroup;



public class MyGroup {
  public static void main(String[] args) {
    new MyGroup().go();
  }
  public void go() {
    GroupMembers groupMembers1 = new GroupMembers("Jonathan", 12345678, "Jonathan@12345678.dk");
    GroupMembers groupMembers2 = new GroupMembers("Niels", 23456789, "Niels@23456789.dk");
    GroupMembers groupMembers3 = new GroupMembers();
    GroupMembers groupMembers4 = new GroupMembers();

    System.out.println("Group Members: \n");
    System.out.println(groupMembers1);
    System.out.println(groupMembers2);
    System.out.println(groupMembers3);
    System.out.println(groupMembers4);
  }
}
