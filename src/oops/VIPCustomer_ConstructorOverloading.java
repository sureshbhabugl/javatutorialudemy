package oops;

import org.junit.Test;

public class VIPCustomer_ConstructorOverloading {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

    private String name;
    private double creditLimit;
    private String email;

    // 1st constructor empty should call the constructor with 3 parameters with default values
    public VIPCustomer_ConstructorOverloading(){
        // **NOTE** when calling other constructor, the this() method should be the first line in the constructor that calls another constructor.
        this("no name", 0.0, "noemail@yourmail.com");
    }

    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    public VIPCustomer_ConstructorOverloading(String name, double creditLimit){
        // **NOTE** when calling other constructor, the this() method should be the first line in the constructor that calls another constructor.
        this(name, creditLimit, "noemail@yourmail.com");
    }

    // 3rd constructor should save all fields.
    public VIPCustomer_ConstructorOverloading(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit = creditLimit;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Credit Limit: "+this.creditLimit);
        System.out.println("Email: "+ this.email);
    }

    @Test
    public void defaultConstructorTest(){

        VIPCustomer_ConstructorOverloading customer = new VIPCustomer_ConstructorOverloading();

        customer.getDetails();

    }

    @Test
    public void twoParametersTest(){
        VIPCustomer_ConstructorOverloading customer = new VIPCustomer_ConstructorOverloading("Suresh", 800);

        customer.getDetails();
    }

    @Test
    public void threeParameterConstructorTest(){
        VIPCustomer_ConstructorOverloading customer = new VIPCustomer_ConstructorOverloading("Suresh Bhabu Gopal", 900, "suresh@myemail.com");

        customer.getDetails();
    }

}
