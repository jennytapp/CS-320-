package appointmentservice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.util.Date;
import org.junit.jupiter.api.Test;


/*
 * Tests AppointmentService class.
 * Tests adding appointments, no duplicate ID's, and deleting an appointment.
 */

class AppointmentServiceTest {

	//Sample future date to use for appointment tests
	private Date futureDate = Date.from(Instant.parse("2099-01-01T12:00:00Z"));
	
	
	//Tests an appointment can be added.
	@Test
	void testAddAppointment() {
		AppointmentService service = new AppointmentService();
		
		Appointment appointment = new Appointment("101", futureDate, "Cut and style");
		
		service.addAppointment(appointment);
		
		assertEquals(appointment, service.getAppointment("101"));
	}
	
	
	//Test that adding 2 appointments with the same ID will throw an exception.
	@Test
	void testDuplicateAppointmentId() {
		AppointmentService service = new AppointmentService();
		
		Appointment firstAppointment = new Appointment("101", futureDate, "Cut and style");
		
		Appointment duplicateAppointment = new Appointment("101", futureDate, "Color and style");
		
		service.addAppointment(firstAppointment);
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.addAppointment(duplicateAppointment);
		});
	}
	
	
	//Test that deleting an appointment removes it.
	@Test
	void testDeleteAppointment() {
		AppointmentService service = new AppointmentService();
		
		Appointment appointment = new Appointment("101", futureDate,"Cut and Style");
		
		service.addAppointment(appointment);
		service.deleteAppointment("101");
		
		assertNull(service.getAppointment("101"));
	}
	
	

}
