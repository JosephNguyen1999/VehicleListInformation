package edu.uga.cs1302.vehicles;

public class Ship extends Vehicle implements Floatable{

    //used protected so that other classes in the hierarchy could access it
    protected int tonnage;
    protected String owner;
    protected int maxPassengers;
    protected int topSpeed;
    
    //constructor for Ship class
    public Ship(String name, String manufacturer, int year, int tonnage, String owner, int maxPassengers, int topSpeed){
        super(name, manufacturer, year);
        
        this.tonnage = tonnage;
        this.owner = owner;
        this.maxPassengers = maxPassengers;
        this.topSpeed = topSpeed;
        
    }
    
    //getters and setters for instance variables
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
    
    //overrides toString method of Vehicle class
    @Override
    public String toString(){
        String result = ("Type: Ship\n" +
                         "Name: " + name +
                         "\nManufacturer: " + manufacturer +
                         "\nManufacturer year: " + year +
                         "\nTonnage: " + tonnage +
                         "\nOwner: " + owner +
                         "\nMax passengers: " + maxPassengers +
                         "\nTop speed: " + topSpeed + " mph");
        
        return result;
    }
    
    
}
