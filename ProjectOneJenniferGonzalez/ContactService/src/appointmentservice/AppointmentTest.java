/*
 * CS 230 Jennifer Gonzalez
 *AppointmentTest Class -
 *Tests the Appointment class requirements.
  */
package appointmentservice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.util.Date;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	//Sample values for testing to reject appointments in the past.
	private Date futureDate = Date.from(Instant.parse("2099-01-01T12:00:00Z"));
	private Date pastDate = Date.from(Instant.parse("2000-01-01t12:00:00Z"));
	
	//Test valid appointment stores correct ID, date & description
	@Test
	void testValidAppointment() {
		Appointment appointment = new Appointment("101", futureDate, "Cut and style");
		assertEquals("101", appointment.getAppointmentId());
		assertEquals(futureDate, appointment.getAppointmentDate());
		assertEquals("Cut and style", appointment.getDescription());
	}

	
	//Test ID can't be null.
	void testNullId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, futureDate, "Cut and style");
		});
	}
	
	
	//Tests ID can't be more than 10 characters
	@Test
	void testIdTooLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("01234567890", futureDate, "Cut and Style");
		});
	}
	
	
	//Test date can't be null
	@Test
	void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("101", null, "Cut and style");
		});
	}
	
	
	//Test a past date is rejected.
	@Test
	void testPastDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("101", pastDate, "Cut and style");
		});
	}
	
	
	//Test a null description is rejected.
	@Test
	void testNullDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("101", futureDate, null);
		});
	}
	
	
	//Tests description can't be over 50 characters.
	@Test
	void testDescriptionTooLong() {
		String description = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("101", futureDate, description);
		});
	}
	
	
}
