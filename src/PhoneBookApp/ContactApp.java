package PhoneBookApp;

public class ContactApp {
    public static void main(String[] args) {
        //Whenever an object is created you make reference to the constructor of the class
        Contact contact = new Contact();
        Contact contact2 = new Contact("Daniel", 50488465l, "London", "email24@hotmail.com");
        Contact contact3 = new Contact("Claire", 7089059l, "Warsaw", "claire@gmail.com");
        Contact contact4 = new Contact("Steven", 408408l, "Toronto", "steven@canada.ca");

//        System.out.println(contact2.name);
//        System.out.println(contact2.contactDetails());
//        System.out.println(contact3.contactDetails());
//        System.out.println(contact4.contactDetails());

        Contact contacts [] = {contact2, contact3, contact4};
//        System.out.println(contacts[2].contactDetails());
//        for (int i =0; i< contacts.length; i++){
//            System.out.println(contacts[i].contactDetails());}
        for (int i =0; i< contacts.length; i++){
            if(contacts[i].address.equalsIgnoreCase("Toronto")){
                System.out.println(contacts[i].contactDetails());
            }

        }
    }
}
