package taskservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * This class tests Test class to ensure the requirements are running properly.
 */

class TaskTest {

	//Test to ensure a task is created with valid information.
	@Test
	void testValidTask() {
		Task task = new Task("001", "Assignment 1", "Type and submit Assignment 1");
		
		assertEquals("001", task.getTaskId());
		assertEquals("Assignment 1", task.getName());
		assertEquals("Type and submit Assignment 1", task.getDescription());
		
	}
	
	//Tests a task ID can't be null
	@Test
	void testNullTaskId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Assignment 1", "Type and submit Assignment 1");
		});	
	}
	
	
	//Tests that task ID can't be more than 10 characters
	@Test
	void testTaskIdTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("012345678901", "Assignment 1", "Type and submit Assignment 1");
		});
	}

	
	//Tests a task name can't be null
	@Test
	void testNullTaskName () {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", null, "Tybe and submit Assignment1");
		});
	}
	
	//Tests a task name can't be over 20 characters.
	@Test
	void testTaskNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "012345678901234567890", "Tybe and submit Assignment1");
		});		
	}
	
	//Tests a task description can't be null
	@Test
	void testNullTaskDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "Assignment 1", null);
		});
	}
	
	
	//Tests a task description can't be over 50 characters
	@Test
	void testTaskDescriptionTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("001", "Assignment 1", "012345678901234567890123456789012345678901234567890");
		});
	}
	
	
	//Test a task name can be updated.
	@Test
	void testUpdateTaskName() {
		Task task = new Task("001", "Assignment 1", "Type and submit Assignment 1");
		
		task.setName("Assignment 2");
		
		assertEquals("Assignment 2", task.getName());
	}
	
	
	//Tests a task description can be updated.
	@Test
	void testUpdateTaskDescription() {
		Task task = new Task("001", "Assignment 1", "Type and submit Assignment 1");
		
		task.setDescription("Type and submit Assignment2");
		
		assertEquals("Type and submit Assignment2", task.getDescription());
	}
	
}
