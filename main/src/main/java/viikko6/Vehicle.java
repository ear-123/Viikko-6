package main;

public abstract class Vehicle {
    private String type;
    private String manufacturer;
    private String model;
    private Int maxSpeed;

    public Vehicle(String type, String manufacturer, String model, Int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
