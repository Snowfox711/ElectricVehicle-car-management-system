public class ChargingStation {
            
    
    // -- Constructor --
    private String ID;
    private String location;
    private double availableChargingCapacity;
        
    protected ChargingStation(){
        this("", "", 0);
    }

    protected ChargingStation(String ID, String location, double availableChargingCapacity) {
        this.ID = ID;
        this.location = location;
        this.availableChargingCapacity = availableChargingCapacity;
    }


    // -- Getter --
    public String getID() {
        return ID;
    }
    
    public String getLocation() {
        return location;
    }
    
    public double getAvailableChargingCapacity() {
        return availableChargingCapacity;
    }
        
        
    // -- Setter --
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setAvailableChargingCapacity(double availableChargingCapacity) {
        this.availableChargingCapacity = availableChargingCapacity;
    }  
    

    // -- Output --
    public String toString(){
        return "\n -- Charging Station -- " + 
               "\nCharging Station ID: " + ID + 
               "\nCharging Station Location: " + location + 
               "\nAvailable Charging Capacity (in kilowatt-hours): " + availableChargingCapacity + " kWh"
               ;
    }
}
