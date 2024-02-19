package main;

public class Plane extends Vehicle{
    private Engine engine = new Engine("Suihkumoottori", 500);

    public Plane(String manufactrurer, String model, int maxSpeed){
        super("plane", manufactrurer, model, maxSpeed);
    }


    public void fly(){

    }
}
