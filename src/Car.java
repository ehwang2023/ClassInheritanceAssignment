//Car class inherits from Vehicle class
public class Car extends Vehicle{
    //define additional variables that are only used in this class
    private double MPG;
    private int Range; //in miles

    public Car(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb); //uses the super constructor
    }
    //getters and setters
    public double getMPG(){return MPG;}
    public void setMPG(double inMPG){MPG = inMPG;}
    public int getRange(){return Range;}
    public void setRange(int inRange){Range = inRange;}
}

//class GasolineCar inherits from Car class
class GasolineCar extends Car{
    public GasolineCar(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, double inMPG) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setMPG(inMPG);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "MPG: \t" + getMPG();
        return result;
    }
}

//class ElectricCar inherits from Car class
class ElectricCar extends Car{
    public ElectricCar(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, int inRange) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setRange(inRange);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Range(m): \t" + getRange();
        return result;
    }
}

