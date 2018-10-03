/**
 * Richard Fitzgerald
 * CH2PC1 - Car Class
 * Programming III - AP
 * 9/28/18
 */
public class CarRunner {

   
    public static void main(String[] args) {
        Car ford = new Car(2001, "Ford");
        
        ford.accelerate();
        System.out.println(ford.getSpeed());
        ford.accelerate();
        System.out.println(ford.getSpeed());
        ford.accelerate();
        System.out.println(ford.getSpeed());
        ford.accelerate();
        System.out.println(ford.getSpeed());
        ford.accelerate();
        System.out.println(ford.getSpeed());
        ford.brake();
        System.out.println(ford.getSpeed());
        ford.brake();
        System.out.println(ford.getSpeed());
        ford.brake();
        System.out.println(ford.getSpeed());
        ford.brake();
        System.out.println(ford.getSpeed());
        ford.brake();
        System.out.println(ford.getSpeed());
        
        
    }
}
