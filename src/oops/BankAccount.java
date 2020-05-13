package oops;


/*

        // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
 */

import org.junit.Before;
import org.junit.Test;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    public void setAccountNumber(long accountNumber){
        this.accountNumber=(accountNumber==0)? 0: accountNumber ;
    }

    public void setBalance(double balance){
        this.balance = (balance==0.0)?0:balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = (customerName.isEmpty()) ? null: customerName;
    }

    public void setEmail(String email){
        this.email = (email.isEmpty()) ? null:email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = (phoneNumber.isEmpty()) ? null : phoneNumber;
    }

    // 1. To allow the customer to deposit funds (this should increment the balance field).

    public void depositFunds(double funds){
        if(funds!=0){
            this.balance = this.getBalance()+funds;
            System.out.println("Your new balance is : $"+this.getBalance());
        }else{
            System.out.println("Funds cannot be empty...");
        }

    }


    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.

    public void withdrawFunds(double withdrawalAmount){
        double currentBalance = this.getBalance();

        if(currentBalance< withdrawalAmount){
            System.out.println("You do not have enough balance to withdraw");
        }else{
            this.setBalance(this.getBalance()-withdrawalAmount);
            System.out.println("Your new balance is $"+this.getBalance());
        }

    }

    public void getAccountDetails(){

        System.out.println("*******************************************");
        System.out.println("Account Number: "+this.getAccountNumber());
        System.out.println("Customer Name: "+this.getCustomerName());
        System.out.println("Customer Email: "+this.getEmail());
        System.out.println("Customer Phone Number:"+this.phoneNumber);
        System.out.println("Current Balance: "+this.getBalance());
        System.out.println("*******************************************");
    }

    BankAccount bofa;

    @Before
    public void initBankAccount() {
        System.out.println("************** INIT ****************");
         bofa = new BankAccount();
        bofa.setAccountNumber(1234567890);
        bofa.setCustomerName("Suresh Bhabu Gopal");
        bofa.setEmail("sureshbhabu.gl@gmail.com");
        bofa.setBalance(10_000D);
        bofa.setPhoneNumber("9372399718");
        bofa.getAccountDetails();
        System.out.println("************** END OF INIT ****************");

    }


    @Test
    public void depositTest(){
        System.out.println("************** Deposit Test****************");
        bofa.depositFunds(20_000D);
        bofa.getAccountDetails();
        System.out.println("************** End of Deposit Test****************");
    }

    @Test
    public void withdrawalTestNegative(){
        System.out.println("************** Withdrawl Negative Test****************");

        bofa.withdrawFunds(40_000);

        bofa.getAccountDetails();

        System.out.println("************** End of Withdrawl Negative Test****************");

    }

    @Test
    public void withdrawalTestPositive(){
        System.out.println("************** Withdrawl Positive Test****************");

        bofa.withdrawFunds(10_000);

        bofa.getAccountDetails();

        System.out.println("************** End of Withdrawl Positive Test****************");

    }

}
