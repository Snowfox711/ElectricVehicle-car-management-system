public class Tesla extends ElectricCar{


    // -- Constructor --
    private boolean isAutoPilotEnabled;
    private boolean isFullSelfDrivingEnabled;
    private boolean isTeslaTheatreEnabled;

    protected Tesla(){
        this("", "", 0, new Manufacturer(), false, false, false);
    }

    protected Tesla(String ID, String carModel, double batteryCapacity, Manufacturer carManufacturer, boolean isAutoPilotEnabled, boolean isFullSelfDrivingEnabled, boolean isTeslaTheatreEnabled) {
        super(ID, carModel, batteryCapacity, carManufacturer);
        this.isAutoPilotEnabled = isAutoPilotEnabled;
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    } 


    // -- Getter --
    public boolean getIsAutoPilotEnabled(){
        return isAutoPilotEnabled;
    }

    public boolean getIsFullSelfDrivingEnabled(){
        return isFullSelfDrivingEnabled;
    }
    
    public boolean getIsTeslaTheatreEnabled(){
        return isTeslaTheatreEnabled;
    }
   

    // -- Setter --
    public void setIsAutoPilotEnabled(boolean isAutoPilotEnabled){
        this.isAutoPilotEnabled = isAutoPilotEnabled;
    }

    public void setIsFullSelfDrivingEnabled(boolean isFullSelfDrivingEnabled){
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
    }

    public void setIsTeslaTheatreEnabled(boolean isTeslaTheatreEnabled){
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }
   

    // -- Output --
    @Override
    public String toString() {
        return "\nCar Model: Tesla" + super.toString() + 
               "\nAuto Pilot Enabled: " + isAutoPilotEnabled + 
               "\nFull Self Driving Enabled: " + isFullSelfDrivingEnabled + 
               "\nTesla Theatre Enabled: " + isTeslaTheatreEnabled
            ;
    }
}
