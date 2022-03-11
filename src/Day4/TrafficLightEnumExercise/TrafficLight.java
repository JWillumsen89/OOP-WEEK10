package Day4.TrafficLightEnumExercise;

public class TrafficLight {
 private TrafficLightColor color;

 TrafficLight(TrafficLightColor color) {
  setColor(color);}

  void setColor(TrafficLightColor color) {
  this.color = color;}

  TrafficLightColor getColor() {
  return color;}

  @Override
  public String toString() {
    return "Traffic light color: " + color;
  }
}
