class Car{
    String make;
    String models;
    int numDoors;

  Car(String make, String models){
      this(make, models, 4);
  }
  Car(String make, String model, int nDoors){
      this.make = make;
      this.models = model;
      this.numDoors = nDoors;
  }
  void printDetails(){
      System.out.println("Make = " + make);
      System.out.println("Models = " + models);
      System.out.println("Number of Doors = " + numDoors);
      System.out.println();
  }
}
public class Cars{
  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry");
    myCar.printDetails();
    Car yourCar = new Car("Mazda","RX-8", 2);
    yourCar.printDetails();
}
}
