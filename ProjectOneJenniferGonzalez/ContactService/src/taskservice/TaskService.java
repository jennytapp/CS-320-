package taskservice;
/*
 * Jennifer Gonzalez 9/24/2026
 */

import java.util.ArrayList;
import java.util.List;


/*
 * This class is to manage Task objects in memory.
 * The methods add, delete, and update a task.
 */

public class TaskService {
	
	private final List<Task> tasks = new ArrayList<>();

	//Adds task to the list if another task does not have the same ID.
	public void addTask(Task task) {
		for (Task existingTask : tasks) {
			if (existingTask.getTaskId().equals(task.getTaskId())) {
				throw new IllegalArgumentException("Task ID already exists.");
			}
		}
		tasks.add(task);
	}
	
	//Delete a task from the list with the TaskID.
	public void deleteTask(String taskId) {
		tasks.removeIf(task -> task.getTaskId().equals(taskId));
	}
	
	
	//Update a task name & description using the ID.
	public void updateTask(String taskId, String name, String description) {
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				task.setName(name);
				task.setDescription(description);
				return;
			}
		}
		throw new IllegalArgumentException("Task ID not Found.");
	}
	
	
	
	
}
