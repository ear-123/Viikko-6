package main.java.viikko6;

public class Car extends Vehicle{
    private Engine engine = new Engine("V8", 300);

    public Car(String manufactrurer, String model, int maxSpeed){
        super("Auto", manufactrurer, model, maxSpeed);
    }

    public void drive(){

    }

    //public void printInfo(){
    //    System.out.println("Auto : "+this.manufacturer+" "+this.model);
    //    System.out.println("Moottori :"+this.engine.getName()+" "+this.engine.getPower()+"kW");
    //    System.out.println("Huippunopeus: "+ this.maxSpeed+"km/h");
    //}
}