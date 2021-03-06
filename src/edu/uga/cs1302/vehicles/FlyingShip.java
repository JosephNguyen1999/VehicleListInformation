package edu.uga.cs1302.vehicles;

public class FlyingShip extends Vehicle implements Flyable, Floatable{

    //used protected so that other classes in the hierarchy could access it
    protected int numberOfEngines;
    protected int maxAltitude;
    protected int maxRange;
    protected int tonnage;
    protected String owner;
    protected int maxPassengers;
    protected int topSpeed;
    
    //constructor for FlyingShip class
    public FlyingShip(String name, String manufacturer, int year, int numberOfEngines, int maxAltitude, int maxRange, int tonnage, String owner, int maxPassengers, int topSpeed){
        super(name, manufacturer, year);
        
        this.numberOfEngines = numberOfEngines;
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.tonnage = tonnage;
        this.owner = owner;
        this.maxPassengers = maxPassengers;
        this.topSpeed = topSpeed;
    }
    
    //getters and setters for instance variables
    public int getNumberOfEngines(){
        return numberOfEngines;
    }
    
    public void setNumberOfEngines(int numberOfEngines){
        this.numberOfEngines = numberOfEngines;
    }
    
    public int getMaxAltitude(){
        return maxAltitude;
    }
    
    public void setMaxAltitude(int maxAltitude){
        this.maxAltitude = maxAltitude;
    }
    
    public int getMaxRange(){
        return maxRange;
    }
    
    public void setMaxRange(int range){
        this.maxRange = maxRange;
    }
    
    public int getTonnage(){
        return tonnage;
    }
    
    public void setTonnage(int tonnage){
        this.tonnage = tonnage;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    public int getMaxPassengers(){
        return maxPassengers;
    }
    
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    
    public int getTopSpeed(){
        return topSpeed;
    }
    
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    
    //overrides toString method of the Vehicle class
    @Override
    public String toString(){
        String result = ("Type: Flying Ship\n" +
                         "Name: " + name +
                         "\nManufacturer: " + manufacturer +
                         "\nManufacturer year: " + year +
                         "\nNumber of engines: " + numberOfEngines +
                         "\nMax altitude: " + maxAltitude + " ft" +
                         "\nMax range: " + maxRange + " mi" +
                         "\nTonnage: " + tonnage +
                         "\nOwner: " + owner +
                         "\nMax passengers: " + maxPassengers +
                         "\nTop speed: " + topSpeed + " mph");
        
        return result;
    }
    
}
