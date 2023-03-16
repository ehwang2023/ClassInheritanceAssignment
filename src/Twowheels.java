//Twowheels class inherits from Vehicle class
public class Twowheels extends Vehicle {
    //define additional variables that are only used in this class
    private double ZeroTo124mph;
    private int Battery;//in volt(V)

    public Twowheels(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb); //uses the super constructor
    }
    //getters and setters
    public double getZeroTo124mph(){return ZeroTo124mph;}
    public void setZeroTo124mph(double inZeroTo124mph){ZeroTo124mph = inZeroTo124mph;}
    public int getBattery(){return Battery;}
    public void setBattery(int inBattery){Battery = inBattery;}
}

//class Motorcycle inherits from Twowheels class
class Motorcycle extends Twowheels{
    public Motorcycle(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, double inZeroTo124mph) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setZeroTo124mph(inZeroTo124mph);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Accelerate from 0 to 124mph(s) : \t" + this.getZeroTo124mph();
        return result;
    }
}

//class ElectricScooter inherits from Twowheels class
class ElectricScooter extends Twowheels{
    public ElectricScooter(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, int inBattery) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setBattery(inBattery);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Battery(V) : \t" + this.getBattery();
        return result;
    }
}


