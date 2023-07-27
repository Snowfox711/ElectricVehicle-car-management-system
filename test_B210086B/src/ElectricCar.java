public class ElectricCar {
        
    
        // -- Constructor --
        private String ID;
        private String carModel;
        private double batteryCapacity;
        private Manufacturer carManufacturer;
        private ChargingStation chargingStation;

        protected ElectricCar(){
            this("", "", 0, new Manufacturer());
        }

        protected ElectricCar(String ID, String carModel, double batteryCapacity, Manufacturer carManufacturer) {
            this.ID = ID;
            this.carModel = carModel;
            this.batteryCapacity = batteryCapacity;
            this.carManufacturer = carManufacturer;
            this.chargingStation = new ChargingStation();
        }
    
    
        // -- Getter --
        public String getID() {
            return ID;
        }
    
        public String getCarModel() {
            return carModel;
        }
    
        public double getBatteryCapacity(){
            return batteryCapacity;
        }

        public Manufacturer getCarManufacturer() {
            return carManufacturer;
        }

        public ChargingStation getChargingStation() {
            return chargingStation;
        }        
        
        
        // -- Setter --
        public void setID(String ID) {
            this.ID = ID;
        }
    
        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public void setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        } 

        public void setCarManufacturer(Manufacturer carManufacturer) {
            this.carManufacturer = carManufacturer;
        }  
        
        public void setChargingStation(ChargingStation chargingStation) {
            this.chargingStation = chargingStation;
        }   
                
        
        // -- Output --
        public String toString(){
            return "\nCar ID: " + ID +
                   "\nCar Model: " + carModel +
                   "\nBattery Capacity in kilowatt-hours: " + batteryCapacity + "kWh" +
                   "\nCar Manufacturer: " + carManufacturer.getName()
                   ;
        }
}
