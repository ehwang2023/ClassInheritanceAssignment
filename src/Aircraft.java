//Aircraft class inherits from Vehicle class
public class Aircraft extends Vehicle {
    //define additional variables that are only used in this class
    private String Engine;
    private String DeflationSystem;

    public Aircraft(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb); //uses the super constructor
    }
    //getters and setters
    public String getEngine(){return Engine;}
    public void setEngine(String inEngine){Engine = inEngine;}
    public String getDeflationSystem(){return DeflationSystem;}
    public void setDeflationSystem(String inDeflationSystem){DeflationSystem = inDeflationSystem;}

}

//class Airplane inherits from Aircraft class
class Airplane extends Aircraft{
    public Airplane(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, String inEngine) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setEngine(inEngine);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Engine Type: \t\t\t" + this.getEngine();
        return result;
    }
}

//class HotAirBalloon inherits from Aircraft class
class HotAirBalloon extends Aircraft{
    public HotAirBalloon(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb, String inDeflationSystem) {
        super(inColor, inBrand, inSpeed, inPassengers, inCurb);
        this.setDeflationSystem(inDeflationSystem);
    }
    //toSting of base + its additional variable
    public String toString(){
        String result = super.toString() + "Deflation System Type: \t\t\t" + this.getDeflationSystem();
        return result;
    }
}

