package Contact_List;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contacts){
        if(findContacts(contacts.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }
    public boolean updateContact(Contacts oldContacts, Contacts newContacts) {
        int position = findContacts(oldContacts);
        if(position < 0){
            System.out.println(oldContacts.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(position, newContacts);
        System.out.println(oldContacts.getName() + " is replaced with " + newContacts.getName() + ".");
        return true;
    }
    private int findContacts(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    private int findContacts(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contacts){
        if(findContacts(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
         int pos = findContacts(name);
         if(pos >= 0){
             return this.myContacts.get(pos);
         }
         return null;
    }


    public boolean removeContact(Contacts contacts){
        int position = findContacts(contacts);
        if(position < 0){
            System.out.println(contacts.getName() + " is not found to be removed.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contacts.getName() + " is successfully removed.");
        return true;

    }

    public void printContacts(){
        System.out.println("Contact List:- ");
        for(int i = 0; i < this.myContacts.size();i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
