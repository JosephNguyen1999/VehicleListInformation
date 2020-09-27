package edu.uga.cs1302.vehicles;

public abstract class Vehicle implements Transporter{

    //used protected so that other classes in the hierarchy could access it
    protected String name;
    protected String manufacturer;
    protected int year;
    protected static int numberOfVehicles = 15;
    
    //constructor for Vehicle class
    public Vehicle (String name, String manufacturer, int year){
	this.name = name;
	this.manufacturer = manufacturer;
	this.year = year;
        
    }
    
    //original toString method that gets overriden in other classes
    public String toString(){
	String result = ("Type: Vehicle\n" + 
                         "Name: " + name + 
                         "\nManufacturer: " + manufacturer + 
                         "\nManufacturer year: " + year);
        return result;
    }
}
