import java.util.ArrayList;

public class Customer {
    
    
    // -- Constructor --
    private String ID;
    private String name;
    private ArrayList<ElectricCar> listOfElectricCar;

    protected Customer(){
        this("", "");
    }

    protected Customer(String ID, String name) {
        this.ID = ID;
        this.name = name;
        listOfElectricCar = new ArrayList<ElectricCar>();
    }


    // -- Getter --
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ElectricCar> getElectricCars(){
        return listOfElectricCar;
    }

    public String getCarModel() {
        String model = "";
        for(ElectricCar car: listOfElectricCar){
            model += car.getCarModel();
        }return model;
    }


    // -- Setter --
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElectricCar(ElectricCar electricCar){
        listOfElectricCar.add(electricCar);
    }


    // -- Output --
    public String toString(){
        return "\n -- Customer -- " +
               "\nCustomer ID: " + ID + 
               "\nCustomer Name: " + name + 
               "\nOwned Car List: " + getCarModel()
               ;
    }
}
