import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Contact> contactList = List.of(new Contact("Sowmik", "sowmik@gmail.com", 24, Contact.Gender.MALE),
                new Contact("Ahsanul", "sowmik@gmail.com", 24, Contact.Gender.MALE),
                new Contact("Ananna", "ananna@gmail.com", 24, Contact.Gender.FEMALE),
                new Contact("Mahmudul", "mahmudul@gmail.com", 20, Contact.Gender.MALE),
                new Contact("Ullsh", "ullash@gmail.com", 18, Contact.Gender.MALE),
                new Contact("NamJanina", "namjanina@gmail.com", 30, Contact.Gender.FEMALE));
        ContactService contactService = new ContactService();


        /* This code is for anonymous inner class */

//        List<Contact> contactAgedBetween18and25 = contactService.findContacts(contactList, new FilterCriteria() {
//            @Override
//
//            public boolean match(Contact contact) {
//                return 24 <= contact.getAge() && contact.getAge() <= 25;
//            }
//        });


        /* This code is for lambda expression class */


        List<Contact> contactAgedBetween18and25 = contactService.findContacts(contactList,
                contact -> 24 <= contact.getAge() && contact.getAge() <= 25);

        for (Contact matchedItem : contactAgedBetween18and25) {

            System.out.println(matchedItem.getName());

        }

//        List<Contact> contactAgedBetween18and251 =

//
    }
}