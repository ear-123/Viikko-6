package main;

public class Ship extends Vehicle{
    private Engine engine = new Engine("Wärtsilä Super", 1000);

    public Ship(String manufactrurer, String model, int maxSpeed){
        super("ship", manufactrurer, model, maxSpeed);
    }

    public void printInfo(){
        System.out.println("Laiva : "+this.manufacturer+" "+this.model);
        System.out.println("Moottori :"+this.engine.getName()+" "+this.engine.getPower()+"kW");
        System.out.println("Huippunopeus: "+ this.maxSpeed+"km/h");
    }
    public void sail(){

    }
}
