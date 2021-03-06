package edu.uga.cs1302.vehicles;

public class Airplane extends Vehicle implements Flyable{

    //used protected so that other classes in the class hierarchy could access it
    protected int numberOfEngines;
    protected int maxAltitude;
    protected int maxRange;
    protected int maxPassengers;
    protected int topSpeed;
    
    //constructor for Airplane class
    public Airplane(String name, String manufacturer, int year, int numberOfEngines, int maxAltitude, int maxRange, int maxPassengers, int topSpeed){
        super(name, manufacturer, year);
        
        this.numberOfEngines = numberOfEngines;
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
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
    
    //overrides toString method of Vehicle class
    @Override
    public String toString(){
        String result = ("Type: Airplane\n" +
                         "Name: " + name +
                         "\nManufacturer: " + manufacturer +
                         "\nManufacturer year: " + year +
                         "\nNumber of engines: " + numberOfEngines +
                         "\nMax altitude: " + maxAltitude + " ft" +
                         "\nMax range: " + maxRange + " mi" +
                         "\nMax passengers: " + maxPassengers +
                         "\nTop speed: " + topSpeed + " mph");
        
        return result;
    }
    
}
