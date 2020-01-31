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
    public Truck(double odo,double m,double fue){
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
        if(fuel<requirement){
            return false;
        }
        else{
            return true;
        }
    }
    public String drive(double pastMiles){
        odometer += pastMiles;
        fuel -= pastMiles/mpg;
        if(){
    }
}
