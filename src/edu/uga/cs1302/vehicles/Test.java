package edu.uga.cs1302.vehicles;

import java.util.Scanner;

public class Test{
    
    //main method that puts everything together
    public static void main(String[] args){

        //condition for loop
        int startAndStop = 1;
	VehicleList vehicles = new VehicleList();
        
        //prints the menu
	System.out.println("Vehicle Information Menu:\n" +
                           "Press 1 to see how many vehicles are in the system.\n" +
			   "Press 2 to see the name and the class of each vehicle.\n" +
			   "Press 3 to see which vehicles can fly.\n" +
			   "Press 4 to see which vehicles can float.\n" +
			   "Press 5 to see which vehicles can float AND fly.\n" +
			   "Press 6 to see a description of each vehicle.\n" +
			   "Press h to see brief help information for your system.\n" +
			   "Press q to terminate the program.");
        
	Scanner keyboard = new Scanner(System.in);
        
        //loops so that the user can input commands shown in the menu
        //and shows an error message if user inputs an invalid command
        while (startAndStop == 1){
            String command = keyboard.nextLine();
            if (command.equalsIgnoreCase("1")){
                System.out.println(vehicles.vehicles.length);
            }
            else if (command.equalsIgnoreCase("2")){
                for (int i = 0; i < vehicles.vehicles.length; i++){
                    System.out.println("Name of Vehicle: " + vehicles.vehicles[i].name);
                    System.out.println("Class of Vehicle: " + vehicles.vehicles[i].getClass());
                }
            }
            else if (command.equalsIgnoreCase("3")){
                System.out.println("Vehicles that can fly: ");
                for (int i = 0; i < vehicles.vehicles.length; i++){
                    if(vehicles.vehicles[i] instanceof Flyable){
                        System.out.println(vehicles.vehicles[i].name);
                    }
                }
            }
            else if (command.equalsIgnoreCase("4")){
                System.out.println("Vehicles that can float: ");
                for (int i = 0; i < vehicles.vehicles.length; i++){
                    if (vehicles.vehicles[i] instanceof Floatable){
                        System.out.println(vehicles.vehicles[i].name);
                    }
                }
            }
            else if (command.equalsIgnoreCase("5")){
                System.out.println("Vehicles that can float and fly: ");
                for (int i = 0; i < vehicles.vehicles.length; i++){
                    if (vehicles.vehicles[i] instanceof Floatable && vehicles.vehicles[i] instanceof Flyable){
                        System.out.println(vehicles.vehicles[i].name);
                    }
                }
            }
            else if (command.equalsIgnoreCase("6")){
                for (int i = 0; i < vehicles.vehicles.length; i++){
                    System.out.println(vehicles.vehicles[i].toString() + "\n");
                }
            }
            else if (command.equalsIgnoreCase("h")){
                System.out.println("List of Commands:\n" +
                                   "Press 1 to see how many vehicles are in the system.\n" +
                                   "Press 2 to see the name and the class of each vehicle.\n" +
                                   "Press 3 to see which vehicles can fly.\n" +
                                   "Press 4 to see which vehicles can float.\n" +
                                   "Press 5 to see which vehicles can float AND fly.\n" +
                                   "Press 6 to see a description of each vehicle.\n" +
                                   "Press h to see brief help information for your system.\n" +
                                   "Press q to terminate the program.");
            }
            else if (command.equalsIgnoreCase("q")){
                startAndStop = 0;
            }
            else{
                System.out.println("Re-enter a number between 1-6 or the letters 'h'(for help) or 'q'(to quit).");
            }
        }
        System.exit(0);
    }
}
