package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//Tests a valid contact is added and can be found with the ID
	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("001", "John", "Doe", "9548755309", "300 Maple Lane");
		service.addContact(contact);
		assertEquals(contact, service.getContact(contact.getContactId()));
	}
	
	//Tests a contact with the same ID can't be added
	@Test
	void testDuplicateContactId() {
		ContactService service = new ContactService();
		Contact firstContact = new Contact("001", "John", "Doe", "9547546754", "85 Plain Rd");
		service.addContact(firstContact);
		Contact duplicateContact = new Contact("001", "Jane", "Doe", "9548770000", "100 Ocean Dr");
		assertThrows(IllegalArgumentException.class, () -> service.addContact(duplicateContact));
	}
	
	//Tests a contact can be deleted by contact ID.
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("002", "Jaime","Fox", "8857725307", "765 Pillsbury St");		
		service.addContact(contact);
		service.deleteContact("002");
		assertThrows(IllegalArgumentException.class, () -> service.getContact("002"));
	}
	
	
	//Tests updating a contacts first name
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("004", "Jaime","Fox", "8857725307", "895 Pillsbury St");
		service.addContact(contact);
		service.updateFirstName("004", "Johnathan");
		assertEquals("Johnathan", service.getContact("004").getFirstName());
	}
	
	//Tests updating a contacts last name
		@Test
		void testUpdateLastName() {
			ContactService service = new ContactService();
			Contact contact = new Contact("005", "Jennifer","Red", "8857725307", "845 Pillsbury St");
			service.addContact(contact);
			service.updateLastName("005", "Brown");
			assertEquals("Brown", service.getContact("005").getLastName());
		}
		
		
		//Tests updating a contacts phone number.
		@Test
		void testUpdatePhone() {
			ContactService service = new ContactService();
			Contact contact = new Contact("006", "Shaylee","Monty", "6667778888", "28 Pillsbury St");
			service.addContact(contact);
			service.updatePhone("006", "7776669999");
			assertEquals("7776669999", service.getContact("006").getPhone());
		}
		
		
		//Tests updating a contacts address.
		@Test
		void testUpdateAddress() {
			ContactService service = new ContactService();
			Contact contact = new Contact("007", "Mark","Waller", "8859990000", "25 Fig Road");
			service.addContact(contact);
			service.updateAddress("007", "35 Walnut Street");
			assertEquals("35 Walnut Street", service.getContact("007").getAddress());
		}
		

}
