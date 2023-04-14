import java.util.ArrayList;
import java.util.List;

public class ContactService {
    /* we comment out all this code for using anonymous class or lambda expression*/


//    public List<Contact>findContactAgedBetween18and25(List<Contact>contacts){
//
//        List<Contact>contactAgedBetween18and25 = new ArrayList<>();
//
//        for(Contact contact:contacts){
//            if(18<=contact.getAge() && contact.getAge()<=25){
//                contactAgedBetween18and25.add(contact);
//            }
//        }
//        return contactAgedBetween18and25;
//    }
//
//    public List<Contact>findMaleContactAgedBetween18and25(List<Contact>contacts){
//
//        List<Contact>maleAgedBetween18and25 = new ArrayList<>();
//
//        for(Contact contact:contacts){
//            if(18<=contact.getAge() && contact.getAge()<=25 && contact.getGender() == Contact.Gender.MALE){
//                maleAgedBetween18and25.add(contact);
//            }
//        }
//        return maleAgedBetween18and25;
//    }
//
//    public List<Contact>findFemaleContactAgedBetween18and25(List<Contact>contacts){
//
//        List<Contact>femaleAgedBetween18and25 = new ArrayList<>();
//
//        for(Contact contact:contacts){
//            if(18<=contact.getAge() && contact.getAge()<=25 && contact.getGender() == Contact.Gender.FEMALE){
//                femaleAgedBetween18and25.add(contact);
//            }
//        }
//        return femaleAgedBetween18and25;
//    }


    public List<Contact>findContacts(List<Contact>contacts, FilterCriteria criteria){

        List<Contact>matchedContacts = new ArrayList<>();

        for(Contact contact:contacts){

            if(criteria.match(contact)){
                matchedContacts.add(contact);
            }

        }

        return matchedContacts;
    }

}
