package edu.uga.cs1302.vehicles;

public class VehicleList{

    //public so that the main method in Test.java could access it
    public Vehicle[] vehicles;
    
    //constructor of VehicleList class that instantializes the vehicle array that is used in the main method in Test.java
    public VehicleList(){
	vehicles = new Vehicle[15];
        
	vehicles[0] = new Automobile("Mustang Shelby GT350R", "Ford", 2017, 526, 2, 175);
        vehicles[1] = new Automobile("Toosla X", "Toosla", 2020, 600, 4, 190);
        vehicles[2] = new Automobile("Fourd Explorer", "Fourd", 2019, 550, 2, 185);
        
        vehicles[3] = new Airplane("Boeing 787", "Boeing", 2014, 2, 43000, 8500, 280, 587);
        vehicles[4] = new Airplane("Paper Plane", "Paper", 1999, 0, 200, 50, 0, 10);
        vehicles[5] = new Airplane("Boring 789", "Boring", 2016, 4, 60000, 10000, 300, 650);
        
        vehicles[6] = new Ship("Queen Mary 2", "Chantiers de Atlantique", 2004, 149215, "Carnival", 2695, 35);
        vehicles[7] = new Ship("Doosney Pirate Ship", "Doosney Ships", 2018, 160000, "Doosney", 2850, 50);
        vehicles[8] = new Ship("Paper Boat", "Paper", 2002, 0, "Paper", 0, 1);
        
        vehicles[9] = new FlyingShip("Heaven Striker", "Heavenly Ships", 2019, 10, 100000, 50000, 200000, "Heavenly Ships", 5000, 700);
        vehicles[10] = new FlyingShip("Hell Havoc X", "Hell Inc.", 2017, 8, 90000, 40000, 180000, "Hell Inc.", 4000, 500);
        vehicles[11] = new FlyingShip("Joseph Extravagant", "Joseph Industries", 2020, 30, 350000, 100000, 600000, "Joseph", 12000, 1800);
        
        vehicles[12] = new Everythingmobile("Robinmobile", "Bat Industries", 2020, 1000, 6, 50000, 9000, 3000, "Robin", 4, 350);
        vehicles[13] = new Everythingmobile("The Ultimate", "Unknown", 1999, 9999, 99, 99999, 9999, 9999, "Joseph's friend", 999, 9999);
        vehicles[14] = new Everythingmobile("Joseph's Car", "Joseph Industries", 2020, 2000, 18, 175000, 13000, 6500, "Joseph", 6, 5000);
        
        
        
    }
    
}
