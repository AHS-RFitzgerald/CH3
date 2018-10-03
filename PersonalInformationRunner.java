/**
 * Richard Fitzgerald
 * CH3PC3 - Personal Information
 * Programming III - AP
 * 10/1/18
 */
public class PersonalInformationRunner {

   
    public static void main(String[] args) {
        PersonalInformation Richard = new PersonalInformation("Richard", 2287, "Toy Road", 16, 7933119);
        System.out.println("The name is " + Richard.getName());
        System.out.println("Their address is " + Richard.getAddressN() + " " + Richard.getAddressL());
        System.out.println("Their age is " + Richard.getAge());
        System.out.println("Their phone number is 724" + Richard.getPhoneNumber());
        System.out.println("");
        PersonalInformation Lucas = new PersonalInformation("Lucas", 307, "Northern Avenue", 17, 5254497);
        System.out.println("The name is " + Lucas.getName());
        System.out.println("Their address is " + Lucas.getAddressN() + " " + Lucas.getAddressL());
        System.out.println("Their age is " + Lucas.getAge());
        System.out.println("Their phone number is 724" + Lucas.getPhoneNumber());
        System.out.println("");
        PersonalInformation Hannah = new PersonalInformation("Hannah", 2287, "Toy Road", 15, 7933130);
        System.out.println("The name is " + Hannah.getName());
        System.out.println("Their address is " + Hannah.getAddressN() + " " + Hannah.getAddressL());
        System.out.println("Their age is " + Hannah.getAge());
        System.out.println("Their phone number is 724" + Hannah.getPhoneNumber());
    }

}
