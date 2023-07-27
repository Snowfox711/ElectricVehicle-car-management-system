public class Ora extends ElectricCar{


    // -- Constructor --
    private boolean hasPanaromicSunroof;
    private boolean hasWirelessCharging;

    protected Ora(){
        this("", "", 0, new Manufacturer(), false, false);
    }

    protected Ora(String ID, String carModel, double batteryCapacity, Manufacturer carManufacturer, boolean hasPanaromicSunroof, boolean hasWirelessCharging) {
        super(ID, carModel, batteryCapacity, carManufacturer);
        this.hasPanaromicSunroof = hasPanaromicSunroof;
        this.hasWirelessCharging = hasWirelessCharging;
    } 
    

    // -- Getter --
    public boolean getHasPanaromicSunroof(){
        return hasPanaromicSunroof;
    }

    public boolean getHasWirelessCharging(){
        return hasWirelessCharging;
    }


    // -- Setter --
    public void setHasPanaromicSunroof(boolean hasPanaromicSunroof){
        this.hasPanaromicSunroof = hasPanaromicSunroof;
    }

    public void setHasWirelessCharging(boolean hasWirelessCharging){
        this.hasWirelessCharging = hasWirelessCharging;
    }


    // -- Output --
    @Override
    public String toString() {
        return "\nCar Model: Ora" + super.toString() + 
               "\nPanaromic Sunroof: " + hasPanaromicSunroof +
               "\nWireless Charging: " + hasWirelessCharging
        ;
    }
}
