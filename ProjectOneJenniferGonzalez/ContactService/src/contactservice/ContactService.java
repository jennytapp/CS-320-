package contactservice;

import java.util.HashMap;
import java.util.Map;

/*
 * Contact.Service.java
 * 
 * This class tracks the contacts while the program is running.
 * The contacts are stored in memory using a map.
 * The contact ID is used as the key as they will be unique.
 */

public class ContactService {
	
	//key is contact ID, value is the contact information
	private final Map<String, Contact> contacts = new HashMap<>();
	
	/*
	 * addContact 
	 * adds a new contact to the list,cannot be null nor in the list already.
	 */
	
	public void addContact(Contact contact) {
		if (contact == null) {
			throw new IllegalArgumentException("Contact cannot be null");
		}
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exists");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	/*
	 * deleteContact
	 * To remove a contact using it's ID.
	 * If there is no match for an ID, nothing will be deleted & error will be thrown.
	 */
	public void deleteContact(String contactId) {
		if (contactId == null || !contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contacts.remove(contactId);
	}
	
	
	/*
	 * updateFirstName
	 * Searches by contact ID and updates the first name.
	 */
	public void updateFirstName(String contactId, String firstName) {
		findContact(contactId).setFirstName(firstName);
		}
	
	
	/*
	 * updateLastName
	 * Searches by contact ID and updates the last name.
	 */
	public void updateLastName(String contactId, String lastName) {
		findContact(contactId).setLastName(lastName);
	}
	
	
	/*
	 * updatePhone
	 * Searches by contact ID and updates the phone number.
	 */
	public void updatePhone(String contactId, String phone) {
		findContact(contactId).setPhone(phone);
	}
	
	
	/*
	 * updateAddress
	 * Searches by contact ID and updates the address.
	 */
	public void updateAddress(String contactId, String address) {
		findContact(contactId).setAddress(address);
	}
	
	
	/*
	 * findContact
	 * Method used by the update methods to find a contact. 
	 * An error will be thrown if no ID is found.
	 */
	public Contact getContact(String contactId) {
		return findContact(contactId);
	}

	private Contact findContact(String contactId) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found.");
		}
		return contact;
	}
	
	
}//end
