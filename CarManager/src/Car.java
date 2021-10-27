
/**
 *
 * @author meoca
 */         //5 points
public class Car {
    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car() {
    }

    public Car(String colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.colour = colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");

    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");

    } 
    
    public void output(){  
        System.out.println(colour);
        System.out.println(EnginePower);
        System.out.println(Convertible);
        System.out.println(ParkingBrake);
    }
}
