//Boat class inherits from Vehicle class
public class Boat extends Vehicle{
    //define additional variables that are only used in this class
    private double Power;//in Kilowatt (kW)
    private double Length;//in meters (m)

    public Boat(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb); //uses the super constructor
    }
    //getters and setters
    public double getPower(){return Power;}
    public void setPower(double inPower){Power = inPower;}
    public double getLength(){return Length;}
    public void setLength(double inLength){Length = inLength;}
}

//class Submarine inherits from Boat class
class Submarine extends Boat {
    public Submarine(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, double inPower) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setPower(inPower);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Power(Kw): \t" + getPower();
        return result;
    }
}

//class Yacht inherits from Boat class
class Yacht extends Boat {
    public Yacht(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, double inLength) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setLength(inLength);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Length(m): \t" + getLength();
        return result;
    }
}
