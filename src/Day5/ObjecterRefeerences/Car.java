package Day5.ObjecterRefeerences;

public class Car {
  private String regNo;
  private String model;

  Car(String model,String regNo) {
    setRegNo(regNo);
  }

  public String getModel() {
    return model;
  }
  public String getRegNo() {
    return regNo;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }
}
