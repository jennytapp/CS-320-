package taskservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Class to test TaskService. Tests to ensure a task can be added, deleted, and updated.
 */


class TaskServiceTest {

	//Tests a valid task can be added.
	@Test
	void testAddTask() {
		TaskService service = new TaskService();
		Task task = new Task("Task 1", "Assignment 1", "Type and submit Assignment 1");
		assertDoesNotThrow(() -> service.addTask(task));
	}
	
	
	//Tests that duplicate task ID's aren't allowed.
	@Test
	void testDuplicateTaskId() {
		TaskService service = new TaskService();
		service.addTask(new Task("Task 1", "Assigntment 1 ", "Type and subit Assignment 1"));
		assertThrows(IllegalArgumentException.class, () -> {
			service.addTask(new Task("Task 1", "Assignment 2", "Type and submit Assignment 2"));
		});
	}
	
	
	//Tests an existing test can be deleted.
	@Test
	void testDeleteTask() {
		TaskService service = new TaskService();
		service.addTask(new Task("Task 1", "Assignment 1", "Type and submit Assignment 1"));
		assertDoesNotThrow(() -> service.deleteTask("Task 1"));
	}
	
	
	//Tests that a tasks name and description can be updated.
	@Test
	void testUpdateTask() {
		TaskService service = new TaskService();
		service.addTask(new Task("Task 1", "Assignment 1", "Type and submit Assignment 1"));
		assertDoesNotThrow(() -> service.updateTask("Task 1", "Assigntment 2", "Type and submit Assignment 2"));
	}
	
	
	//Tests updating a task that doesn't exist does not throw an exception
	@Test
	void testUpdateTaskNotFound() {
		TaskService service = new TaskService();
		assertThrows(IllegalArgumentException.class, () -> {
			service.updateTask("Task 1", "Assignment 2", "Type and submit Assignment 2");
		});
	}
	

}
