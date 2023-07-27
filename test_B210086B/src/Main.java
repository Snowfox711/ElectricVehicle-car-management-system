import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customer = new ArrayList<Customer>();
        ArrayList<Manufacturer> manufacturer = new ArrayList<Manufacturer>();
        ArrayList<ChargingStation> chargingStation = new ArrayList<ChargingStation>();

        
        // -- Manufacturer List --            
        Manufacturer m1 = new Manufacturer("M001", "Tesla");
        Manufacturer m2 = new Manufacturer("M002", "Ora");
        manufacturer.add(m1);
        manufacturer.add(m2);


        // -- Car Model List --  
        ElectricCar c1 = new Tesla("T001", "Tesla S", 100, m1, false, true, true);
        ElectricCar c2 = new Tesla("T002", "Tesla Y", 81, m1, true, true, true);

        ElectricCar c3 = new Ora("O01", "Ora Good Cat", 47.8, m2, true, true);
        ElectricCar c4 = new Ora("O02", "Ora Black Cat", 33, m2, true, false);


        // -- Add Car to Manufacturer --
        m1.setListOfCarModel(c1);
        m1.setListOfCarModel(c2);
        m2.setListOfCarModel(c3);
        m2.setListOfCarModel(c4);


        // -- Customer List --
        Customer cus1 = new Customer("cus1", "Hello");
        Customer cus2 = new Customer("cus2", "World");
        customer.add(cus1);
        customer.add(cus2);


        // -- Charging Station --
        ChargingStation cs1 = new ChargingStation("cs1", "Mount Austin", 30);
        ChargingStation cs2 = new ChargingStation("cs2", "Dato Onn", 55);
        ChargingStation cs3 = new ChargingStation("cs3", "Skudai", 90);
        chargingStation.add(cs1);
        chargingStation.add(cs2);
        chargingStation.add(cs3);


        // -- UI --
        System.out.println("\n -------- Electric Vehicle (EV) Car Management System -------- ");
        System.out.println("\n -------- Here are the manufacturer and car model list  ------ ");
        for(Manufacturer car: manufacturer){
            System.out.println(car);
        }
        System.out.println("\n------------------------------------------------------------------------- ");
        System.out.println("\nPlease select the option: ");
        System.out.println("\n1 - Display the list of electric car manufacturers and car models ");
        System.out.println("\n2 - Purchase electric cars ");
        System.out.println("\n3 - View and update the charging station ");
        System.out.println("\n4 - Display the list of electric car owner and corresponding information ");
        System.out.println("\n5 - Exit System ");
        System.out.print("\nInput the number to choose: ");


        // -- Constructor --
        int selection = 0;
        selection = sc.nextInt();
        
        while(selection != 0){

            // -- 1. Display The List of Electric Car Manufacturers and Car Models --
            if(selection == 1){
                System.out.println("\n--------- Here Are Our Car and Manufacturer List ---------");
                for(Manufacturer car: manufacturer){
                    System.out.println(car);
                }

            } // -- 2. Purchase Electric Cars from Different Manufacturers --
            else if(selection == 2){
                String chosenCar;
                System.out.print("\nPlease select the car you want to purchase (Enter Car ID): ");
                chosenCar = sc.next();
                    if(chosenCar.equals(c1.getID())){
                        cus1.addElectricCar(c1);
                        c1.setChargingStation(cs1);
                        System.out.println("\nPurchase Successfully! ");
                    }
                    if(chosenCar.equals(c2.getID())){
                        cus1.addElectricCar(c2);
                        c2.setChargingStation(cs2);
                        System.out.println("\nPurchase Successfully! ");
                    }
                    if(chosenCar.equals(c3.getID())){
                        cus1.addElectricCar(c3);
                        c3.setChargingStation(cs3);
                        System.out.println("\nPurchase Successfully! ");
                    }
                    if(chosenCar.equals(c4.getID())){
                        cus1.addElectricCar(c4);
                        c4.setChargingStation(cs1);
                        System.out.println("\nPurchase Successfully! ");
                    }
            
            } // -- 3. View and update the charging station --
            else if(selection == 3){
                System.out.println("\n -- Available Charging Station -- ");
                for(ChargingStation cs: chargingStation){
                    System.out.println(cs);
                }
                System.out.println("\n -- Update Charging Station -- ");
                System.out.println("\nYour Car Charging Station is: ");
                ArrayList<ElectricCar> ecc = cus1.getElectricCars();
                for(ElectricCar ee: ecc){
                    System.out.println("\n" + ee.getCarModel() +
                                       "\nCar ID: " + ee.getID() + 
                                        ee.getChargingStation()
                                      );
                }
                System.out.print("\nDo You Want to Update Your Information? (Y/N) ");
                String updatee;
                updatee = sc.next();
                if(updatee.equals("Y")){
                    System.out.print("\nPlease Select The Car You Want to Update (Input Car ID): ");
                    String update = sc.next();
                    for(ElectricCar ee: ecc){
                        if(ee.getID().equals(update.toUpperCase())){
                            System.out.print("\nPlease Select The Charging Station You Want to Update (Input Charging Station ID): ");
                            String csID = sc.next();
                            for(ChargingStation cs: chargingStation){
                                if(cs.getID().equals(csID.toLowerCase())){
                                    System.out.println("\nUpdate successfully!");
                                }
                            }
                        
                        }
                    }
                
                }
            
            } // -- 4. Display the list of electric car owner and corresponding information --
            else if(selection == 4){
                for(Customer cus: customer){
                    System.out.println(cus);
                    ArrayList<ElectricCar> car = cus.getElectricCars();
                    for(ElectricCar cr: car){
                        System.out.println(cr);
                    }
                }
            
            } // -- 5. Exit System --
            else if(selection == 5){
                System.exit(0);
            }
        
        System.out.println("\n------------------------------------------------------------------------- ");
        System.out.println("\nPlease select the option: ");
        System.out.println("\n1 - Display the list of electric car manufacturers and car models ");
        System.out.println("\n2 - Purchase electric cars ");
        System.out.println("\n3 - View and update the charging station ");
        System.out.println("\n4 - Display the list of electric car owner and corresponding information ");
        System.out.println("\n5 - Exit System ");
        System.out.print("\nInput the number to choose: ");

        selection = sc.nextInt();
        }
    }
}