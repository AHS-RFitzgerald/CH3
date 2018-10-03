/**
 * Richard Fitzgerald
 * CH3PC3 - Personal Information
 * 10/01/18
 */
public class PersonalInformation {
    private String name;
    private int addressN;
    private String addressL;
    private int age;
    private int phoneNumber;
    
    /**
     * The PersonalInformation class constructor initializes the fields 
     * name, addressN, addressL, age, and phoneNumber
     */
    
    public PersonalInformation(String n, int aN, String aL, int a, int pN){
        name = n;
        addressN = aN;
        addressL = aL;
        age = a;
        phoneNumber = pN;
    }
    /**
     *The setname method accepts an argument that is stored
     *in the name field.
    */
    public void setName(String n){
        name = n;
    }
    /**
     *The setadfressN method accepts an argument that is stored
     *in the addressN field.
    */
    public void setAddressN(int aN){
        addressN = aN;
    }
    /**
     *The setaddressL method accepts an argument that is stored
     *in the addressL field.
    */
    public void setAddressL(String aL){
        addressL = aL;
    }
    /**
     *The setage method accepts an argument that is stored
     *in the age field.
    */
    public void setAge(int a){
        age = a;
    }
    /**
     *The setPhoneNumber method accepts an argument that is stored
     *in the phoneNumber field.
    */
    public void setPhoneNumber(int pN){
        phoneNumber = pN;
    }
    /**
     * getName returns the value of name
     */
    public String getName(){
        return name;
    }
    /**
     * getAddressN returns the value of addressN 
     */
    public int getAddressN(){
        return addressN;
    }
    /**
     * getAddressL returns the value of addressL 
     */
    public String getAddressL(){
        return addressL;
    }
    /**
     * getAge returns the value of age 
     */
    public int getAge(){
        return age;
    }
    /**
     * getPhoneNumber returns the value of phoneNumber 
     */
    public int getPhoneNumber(){
        return phoneNumber;
    }
    
}
