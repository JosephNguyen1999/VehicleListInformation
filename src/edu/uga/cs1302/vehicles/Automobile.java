package edu.uga.cs1302.vehicles;

public class Automobile extends Vehicle{

    //used protected so that other classes in the hierarchy could access it
    protected int horsePower;
    protected int maxPassengers;
    protected int topSpeed;
    
    //constructor for Automobile class
    public Automobile(String name, String manufacturer, int year, int horsePower, int maxPassengers, int topSpeed){
	super(name, manufacturer, year);
        
	this.horsePower = horsePower;
	this.maxPassengers = maxPassengers;
	this.topSpeed = topSpeed;
    }
    
    //getters and setters for instance variables
    public int getHorsePower(){
        return horsePower;
    }
    
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
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
    
    //overrides toString metehod in Vehicle class
    @Override
    public String toString(){
        String result = ("Type: Automobile\n" +
                         "Name: " + name +
                         "\nManufacturer: " + manufacturer +
                         "\nManufacturer year: " + year +
                         "\nEngine power: " + horsePower + " hp" +
                         "\nMax passengers: " + maxPassengers +
                         "\nTop speed: " + topSpeed + " mph");
        
        return result;
        
    }
}
