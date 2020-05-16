package Collections.ArrayList;

import org.junit.Test;

import java.util.ArrayList;

/*
	    // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

 */
public class SmartPhone {

    ArrayList<Contacts> myContacts = new ArrayList<>();

    public void store(Contacts contact){
        if(searchContact(contact.getContactName())==-1) {
            myContacts.add(new Contacts(contact));
            System.out.println("The following contact was successfully added...");
            contact.printContact(contact);

        }else{
            System.out.println("The following contact already exists in the system.");
            contact.printContact(contact);
        }


    }

    public void modify(String contactName, Contacts newContacts){
        int index = searchContact(contactName);
        if(index>=0){
            myContacts.set(index,newContacts);
            System.out.println("The contact has been modified.");
        }else{
            System.out.println("The contact "+ contactName +" does not exist in the list.");
        }
    }

    public void query(String contactName){
        Contacts searchResult;
        int index = searchContact(contactName);
        if(index >=0){
            searchResult = myContacts.get(index);
            searchResult.printContact(searchResult);
        }else{
            System.out.println("Contact "+contactName+ " is not found in the list.");
        }

    }

    public void printAllContacts(){
        System.out.println("List of all Contacts");
        System.out.println("********************");
        if(!myContacts.isEmpty()){
            for(Contacts contact:myContacts){
                contact.printContact(contact);
            }
        }
    }

    private int searchContact(String contactName){
        int found = -1;
        int counter = 0;
        for(Contacts c: myContacts){
            if(c.getContactName().equalsIgnoreCase(contactName)){
                found= counter;
                break;
            }
            counter++;
        }
        return found;
    }

    public void deleteContact(String contactName){
        int index = searchContact(contactName);
        if(index>=0){
            myContacts.remove(index);
        }else{
            System.out.println("Contact not found");
        }
    }



    @Test
    public void addContactTest(){
        store(new Contacts("Suresh","12345"));
        store(new Contacts("Suraj","ABCDE"));
        store(new Contacts("Gopal","tutututu"));
        store(new Contacts("Arun","yaya"));
        store(new Contacts("Vijay","surajkutty"));
        printAllContacts();
        //System.out.println(searchContact("Vijay"));
    }

    @Test
    public void searchTest(){
        store(new Contacts("Suresh","12345"));
        query("yiles");
    }

    @Test
    public void modifyTest(){
        store(new Contacts("Suresh","12345"));
        printAllContacts();
        modify("Yikes", new Contacts("Suraj","ABCDE"));
        printAllContacts();

    }



}
