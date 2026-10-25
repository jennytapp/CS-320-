/*
 * CS 230 Jennifer Gonzalez
 *
 *Appointment Class -
 *Creates an appointment object w/ an ID, date, &description.
 *ID can't be null or over 10 characters & also can't be changed.
 *The date can't be null or past.
 *Description can't be null of over 50 characters.
 */

package appointmentservice;

import java.util.Date;



public class Appointment {

	private final String appointmentId;
	private Date appointmentDate;
	private String description;
	
	
	//Create new appointment
	public Appointment(String appointmentId, Date appointmentDate, String description) {
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid date.");
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}
	
	
	//Getters- return appointmentID, date, & description.
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getDescription() {
		return description;
	}
	
} //end
