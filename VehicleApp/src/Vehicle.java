import javax.print.DocFlavor;

public class Vehicle {
    String Make;
    String Model;
    int NumberOfWheels;
    int NumberOfPassagers;

    public Vehicle() {
        Make = "BYD";
        Model = "PLUS";
        NumberOfWheels = 4;
        NumberOfPassagers = 4;
    }

    public Vehicle(String make,String model,int wheels,int passengers){
        Make = make;
        Model = model;
        NumberOfWheels = wheels;
        NumberOfPassagers = passengers;
    }



}
