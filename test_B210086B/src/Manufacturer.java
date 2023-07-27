import java.util.ArrayList;

public class Manufacturer {
    

    // -- Constructor --
    private String ID;
    private String name;
    private ArrayList<ElectricCar> listOfCarModel;

    protected Manufacturer(){
        this("", "");
    }

    protected Manufacturer(String ID, String name) {
        this.ID = ID;
        this.name = name;
        listOfCarModel = new ArrayList<ElectricCar>();
    }


    // -- Getter --
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getListOfCarModel() {
        String model = "";
        for(ElectricCar car: listOfCarModel){
            model += "\nCar Name: " + car.getCarModel() + 
                     "\nCar ID: " + car.getID()
                     ;
        }return model;
    }


    // -- Setter --
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfCarModel(ElectricCar car) {
        listOfCarModel.add(car);
    }
    

    // -- Output --
    public String toString(){
        return "\nManufacturer ID: " + ID +
               "\nManufacturer Name: " + name +
               "\nCar Model: " + getListOfCarModel()
               ;
    }
}
