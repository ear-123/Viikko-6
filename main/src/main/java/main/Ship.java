package main;

public class Ship extends Vehicle{
    //private Engine engine = new Engine("Wärtsilä Super", 1000);

    public Ship(String manufactrurer, String model, int maxSpeed){
        super("Laiva", manufactrurer, model, maxSpeed);
        this.engine = new Engine("Wärtsilä Super", 1000);
    }


    public void sail(){

    }
}
