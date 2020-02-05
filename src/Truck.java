// Charly. 1/31
public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private static final double CAPACITY = 20;
    private static double totalFuel;

    public Truck(String name){
        truckID = name;
    }
    public Truck(String name,double odo,double m,double fue){
        truckID = name;
        odometer = odo;
        mpg = m;
        fuel = fue;
    }
    public String getTruckID(){
        return truckID;
    }
    public double getOdometer(){
        return odometer;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    public void setMpg(double mpg){
        this.mpg = mpg;
    }

    public boolean enoughFuel(double num){
        double requirement = num/mpg;
        if(fuel < requirement){
            return false;
        }
        else{
            return true;
        }
    }
    public String drive(double pastMiles){
        if(enoughFuel(pastMiles)){
            odometer += pastMiles;
            fuel -= pastMiles/mpg;
            return "success";
        }else{
            return "Truck " + truckID + " does not have enough fuel to drive 500.0 miles.";
        }
    }

    public  void fill(){
        totalFuel += (CAPACITY-fuel);
        fuel = 20;
    }

    public  String fill(double g){

        if(totalFuel <= 20){
            fuel += g;
            totalFuel += g;
            return "success";
        }else{
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
        }
    }
    public static double getTotalFuel() {
        return totalFuel;
    }

    public String toString() {
        return "Truck: " + truckID + "\nOdometer: " + odometer + "\nMiles Per Gallon: " + mpg+"\nFuel: " + fuel;
    }
}

