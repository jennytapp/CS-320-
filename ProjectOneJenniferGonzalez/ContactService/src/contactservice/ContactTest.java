package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//Test contact creation & validity.
	@Test
	void testValidContact() {
		Contact contact = new Contact("001", "George", "Washington", "5554447777", "12 Apple Steet");
		assertEquals("001", contact.getContactId());
	}
	
	//Test a contact ID can't be null.
	@Test
	void testNullContactId() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Jane", "Doe", "5556664444", "12 shady lane"));
	}

	//Test contact ID length is no longer than 10 characters
	@Test
	void testContactIdLengthI() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("01234567890", "Jane", "Doe", "5556664444", "12 shady lane"));
	}
	
	//Test first name can't be null
	@Test
	void testNullFirstName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", null, "Doe", "1112223333", "12 Apple Street"));
	}
	
	
	//Test first name under 10 characters.
	@Test
	void testFirstNameLength() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "Geraldineer", "Doe", "1112223333", "12 Apple Street"));
	}
	
	//Test last name can't be null
	@Test
	void testNullLasttName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", null, "1112223333", "12 Apple Street"));
	}
	
	
	//Test last name under 10 characters.
	@Test
	void testLastNameLength() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", "Markenstophson", "1112223333", "12 Apple Street"));
	}
	
	//Test phone numebr can't be null
	@Test
	void testNullPhone() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", "Doe", null, "12 Apple Street"));
	}
	
	
	//Test phone number is 10 characters.
	@Test
	void testPhoneLength() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", "Doe", "111222333", "12 Apple Street"));
	}
	
	//Test address can't be null.
	@Test
	void testNullAddress() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", "Doe", "1112223333", null));
	}
	
	
	//Test address can't exceed 30 characters.
	@Test
	void testAddressLength() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("001", "George", "Doe", "1112223333", "111123452 Mcintosh Apple Street"));
	}
	
	
	
	
	
	
	
}
