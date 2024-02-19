package main;

public class Car extends Vehicle{
    //private Engine engine = new Engine("V8", 300);

    public Car(String manufactrurer, String model, int maxSpeed){
        super("Auto", manufactrurer, model, maxSpeed);
        this.engine = new Engine("V8", 300);
    }

    public void drive(){
        System.out.println(this.name+" "+this.model+" paahtaa tietä eteen päin!");
    }

    //public void printInfo(){
    //    System.out.println("Auto : "+this.manufacturer+" "+this.model);
    //    System.out.println("Moottori :"+this.engine.getName()+" "+this.engine.getPower()+"kW");
    //    System.out.println("Huippunopeus: "+ this.maxSpeed+"km/h");
    //}
}