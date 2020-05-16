package Collections.ArrayList;


import java.sql.SQLOutput;
import java.util.Scanner;

public class MainSmartPhone {

    static SmartPhone iPhone = new SmartPhone();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while(choice!=6){
            choice = displayMenu();

            switch(choice){
                case 1:
                    printAllContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    modifyContacts();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                default:
                    break;

            }

        }

    }

    private static void deleteContact() {
        System.out.println("Enter the contact name to be deleted");
        String contactName = scanner.nextLine();
        if(contactName.isEmpty()){
            System.out.println("Enter a valid contact name");
        }else{
            iPhone.deleteContact(contactName);
        }
    }

    private static void searchContact() {
        System.out.println("Enter the contact name to be searched");
        String contactName = scanner.nextLine();
        if(contactName.isEmpty()){
            System.out.println("Enter a valid contact name");
        }else{
            iPhone.query(contactName);
        }

    }

    private static void modifyContacts() {
        System.out.println("Enter the contact name to be searched");
        String contactName = scanner.nextLine();
        System.out.println("Enter the new Contact name.");
        String newContactName = scanner.nextLine();
        System.out.println("Enter the new Phone number");
        String newContactNumber = scanner.nextLine();

        if(contactName.isEmpty()){
            System.out.println("Enter a valid contact name");
        }else{
            iPhone.modify(contactName,new Contacts(newContactName,newContactNumber));
        }
    }

    private static int  displayMenu(){
        System.out.println("iPhone Contact List");
        System.out.println("1. Print All Contacts");
        System.out.println("2. Add a Contact");
        System.out.println("3. Modify a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Search for a contact");
        System.out.println("6. Quit");
        System.out.println("Enter your choice: \r");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice<1 || choice>6){
            System.out.println("Invalid Choice");
        }
        return choice;

    }

    private static void addContacts() {
        Contacts contact = new Contacts();
        System.out.println("Enter the name of the contact: \r");
        contact.setContactName(scanner.nextLine());
        System.out.println("Enter the phone number: \r");
        contact.setContactNumber(scanner.nextLine());
        iPhone.store(contact);
    }

    private static void printAllContacts() {
        iPhone.printAllContacts();
    }
}
