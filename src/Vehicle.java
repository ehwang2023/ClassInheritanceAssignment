public class Vehicle implements Speedometer{
    //define base variables
    protected String color = "";
    protected String brandName = "";
    protected double speed = 0.0; //in mph
    protected int passengers = 0;
    protected double curbWeight = 0.0; //in pounds (lbs)

    public Vehicle(String inColor, String inBrand, double inSpeed, int inPassengers, double inCurb) {
        color = inColor;
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        curbWeight = inCurb;
    }
    //getters and setters
    public Vehicle(String inBrand){
        brandName = inBrand;
    }
    public String getBrand(){
        return brandName;
    }
    public void setBrand(String inBrand){brandName = inBrand;}
    public String getColor(){return color;}
    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int inPassengers){speed = inPassengers;}
    public double getCurbWeight(){
        return curbWeight;
    }
    public void setCurbWeight(double inCurbWeight){
        curbWeight = inCurbWeight;
    }

    //base toString
    public String toString(){
        String result = "";
        result = "Color: \t\t\t" + getColor() + "\n" + "Brand: \t\t\t" + getBrand() + "\n" + "Speed (mph): \t"
                + getSpeed() + "\n" + "Passengers: \t" + getPassengers() +
                "\n" + "Cargo (lbs): \t" + getCurbWeight() + "\n";
        return result;
    }
}