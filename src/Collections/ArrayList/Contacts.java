package Collections.ArrayList;

public class Contacts {

    private String contactName;
    private String contactNumber;


    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Contacts(){
        this.contactNumber = null;
        this.contactName = null;
    }

    public Contacts(String contactName, String contactNumber){
        this.contactName=(!contactName.isEmpty()) ? contactName : null;
        this.contactNumber=(!contactNumber.isEmpty()) ? contactNumber : null;
    }

    public Contacts(Contacts contact){
        this(contact.contactName, contact.contactNumber);
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void printContact(Contacts contact) {
        System.out.println("Name: "+contact.contactName);
        System.out.println("Phone Number: "+contact.contactNumber);
    }
}
