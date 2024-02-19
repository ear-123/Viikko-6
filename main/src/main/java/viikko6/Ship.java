package main;

public class Ship extends Vehicle{
    private Engine engine = new Engine("Wärtsilä Super", 1000);

    public Ship(String manufactrurer, String model, int maxSpeed){
        super("ship", manufactrurer, model, maxSpeed);
    }


    public void sail(){

    }
}
