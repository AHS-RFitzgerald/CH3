/**
 * Richard Fitzgerald
 * CH3PC2 - Car
 * 9/28/18
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    /**
     * The Car class constructor initializes the fields 
     * yearModel and make.
     */
    public Car(int yModel, String make2){
        yearModel = yModel;
        make = make2;
        speed = 0;
    }
    /**
     *The setyearModel method accepts an argument that is stored
     *in the yearModel field.
    */
    public void setyearModel(int yModel){
        yearModel = yModel;
    }
    /**
     *The setmake method accepts an argument that is stored
     *in the make field.
    */
    public void setmake(String make2){
        make = make2;
    }
    /**
     * getyearModel returns the value of yearModel 
     */
    public int getyearModel(){
        return yearModel;
    }
    /**
     * getmake returns the value of make 
     */
    public String getmake(){
        return make;
    }
    /**
     * the accelerate method adds five to the speed of the car
     */
    public void accelerate(){
        speed += 5;
    }
    /**
     * the brake method subtracts five from the speed of the car
     */
    public void brake(){
        speed -= 5;
    }
    /*
    * getSpeed returns the value of speed
    */
    public int getSpeed(){
        return speed;
    }
}
