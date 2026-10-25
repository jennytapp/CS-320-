package appointmentservice;

import java.util.HashMap;
import java.util.Map;


/*
 * Appointment Service class stores appointment objs.
 * Appointments can be added w/ unique IDs and also deleted by ID.
 * 
 */


public class AppointmentService {
	
	//Store appointments using ID's as keys.
	private Map<String, Appointment> appointments = new HashMap<>();
	
	//Add an appointment if there is no existing ID.
	public void addAppointment(Appointment appointment) {
		if (appointments.containsKey(appointment.getAppointmentId())){
			throw new IllegalArgumentException("Appointment ID already exists");
		}
		appointments.put(appointment.getAppointmentId(), appointment);
	}
	
	
	//Delete an appointment using the appointment ID.
	public void deleteAppointment(String appointmentId) {
		if (!appointments.containsKey(appointmentId)) {
			throw new IllegalArgumentException("Appointment does not exist.");
		}
		appointments.remove(appointmentId);
	}
	
	
	//Returns an appointment by ID for a test.
	public Appointment getAppointment(String appointmentId) {
		return appointments.get(appointmentId);
	}
	//end

}
