package main;

public class Plane extends Vehicle{
    private Engine engine = new Engine("Suihkumoottori", 500);

    public Plane(String manufactrurer, String model, int maxSpeed){
        super("plane", manufactrurer, model, maxSpeed);
    }

    public void printInfo(){
        System.out.println("Lentokone : "+this.manufacturer+" "+this.model);
        System.out.println("Moottori :"+this.engine.getName()+" "+this.engine.getPower()+"kW");
        System.out.println("Huippunopeus: "+ this.maxSpeed+"km/h");
    }

    public void fly(){

    }
}
