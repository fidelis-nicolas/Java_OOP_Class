package PhoneBookApp;

public class Contact {
    public long phoneNumber;
    String name;
    String address;
    String email;

    //Constructors is used to initialise the fields of your class
    //Constructor overloading
    public Contact(){
        //Null constructor
    }
    public Contact(String name ,long phone, String address, String email){
        this.name = name;
        this.phoneNumber = phone;
        this.address = address;
        this.email = email;
    }


}
