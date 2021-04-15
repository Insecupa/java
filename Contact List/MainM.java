package Contact_List;
import java.util.Scanner;

public class MainM {
    private final static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("6304415060");
    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Shutting down.");
                    quit = true;
                }
                case 1 -> mobile.printContacts();
                case 2 -> addContact();
                case 3 -> removeContact();
                case 4 -> modifyContact();
                case 5 -> checkContact();
                case 6 -> printActions();
                default -> System.out.println("No option.");
            }
        }
    }
    public static void addContact(){
        String name, phoneNumber;
        System.out.println("Enter the contact name: ");
        name = scanner.nextLine();
        System.out.println("Enter the contact number: ");
        phoneNumber = scanner.nextLine();
        mobile.addNewContact(new Contacts(name, phoneNumber));
    }

    public static void removeContact(){
        String name;
        System.out.println("Enter the name to remove it from the contact list: ");
        name = scanner.nextLine();
        Contacts existingContact = mobile.queryContact(name);
        if(existingContact == null){
            System.out.println("No such contact exists.");
            return;
        }
        if(mobile.removeContact(existingContact)){
            System.out.println("Successfully deleted.");
        }
        else{
            System.out.println("Error deleting contact.");
        }
    }

    public static void modifyContact(){
        String name;
        System.out.println("Enter the name to remove it from the contact list:");
        name = scanner.nextLine();
        Contacts existingContact = mobile.queryContact(name);
        if(existingContact == null){
            System.out.println("No such contact exists.");
            return;
        }
        String newName, newPhNumber;
        System.out.println("Enter the new Contact name: ");
        newName = scanner.nextLine();
        System.out.println("Enter the new phone number: ");
        newPhNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newPhNumber);
        if(mobile.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated the contact.");
        }
        else{
            System.out.println("Error updating the contact.");
        }
    }

    public static void checkContact(){
        String name;
        System.out.println("Enter the name to get the details: ");
        name = scanner.nextLine();
        Contacts contacts = mobile.queryContact(name);
        if(contacts == null){
            System.out.println("No such contact Exists.");
            return;
        }

        System.out.println("Name: " + contacts.getName() + " and the number is " + contacts.getPhoneNumber() + ".");
    }
    public static void startPhone(){
        System.out.println("Booting....");
        System.out.println("Setting up the environment.");
        System.out.println("All set. Welcome!");
    }

    public static void printActions(){
        System.out.println("\nAvailable Actions:\npress");
        System.out.println("""
                0 - to shutdown.
                1 - to print contacts.
                2 - to add a new contact.
                3 - to remove a contact.
                4 - to modify a contact.
                5 - to check if a contact exists.
                6 - to print available actions.""");
        System.out.println("Choose your actions: ");
    }
}
