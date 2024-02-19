package main.java.viikko6;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printInfo(){
        System.out.println(this.type+": "+this.manufacturer+" "+this.model);
        System.out.println("Moottori :"+this.engine.getName()+" "+this.engine.getPower()+"kW");
        System.out.println("Huippunopeus: "+ this.maxSpeed+"km/h");
    }
}
