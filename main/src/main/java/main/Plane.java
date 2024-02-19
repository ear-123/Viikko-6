package main;

public class Plane extends Vehicle{
    //private Engine engine = new Engine("Suihkumoottori", 500);

    public Plane(String manufactrurer, String model, int maxSpeed){
        super("Lentokone", manufactrurer, model, maxSpeed);
        this.engine = new Engine("Suihkumoottori", 500);
    }


    public void fly(){

    }
}
