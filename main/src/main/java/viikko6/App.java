package viikko6;

import java.util.ArrayList;
import java.util.Scanner;

import main.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            
            String strininput = scan.nextLine();
            int option = 0;
            option = Integer.parseInt(strininput);

            if (option == 0) {
                exit = true;
                continue;
            }
            if (option == 1) {
                System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                int typeNum = Integer.parseInt(scan.nextLine());
                System.out.println("Anna kulkuneuvon valmistaja:");
                String manufacturer = scan.nextLine();
                System.out.println("Anna kulkuneuvon malli:");
                String model = scan.nextLine();
                System.out.println("Anna kulkuneuvon huippunopeus:");
                int maxSpeed = Integer.parseInt(scan.nextLine());
                if (typeNum == 1) {
                    vehicles.add(new Car(manufacturer, model, maxSpeed));
                }
                if (typeNum == 2) {
                    vehicles.add(new Plane(manufacturer, model, maxSpeed));
                }
                if (typeNum == 3) {
                    vehicles.add(new Ship(manufacturer, model, maxSpeed));
                }
            
            if (option == 2) {
                for (Vehicle vehicle : vehicles) {
                    vehicle.printInfo();
                    System.out.println("");
                }
            }

            }
            else {
                System.out.println("Syöte oli väärä");
                continue;
            }
        }
        scan.close();
        System.out.println("Kiitos ohjelman käytöstä.");
    }
}
