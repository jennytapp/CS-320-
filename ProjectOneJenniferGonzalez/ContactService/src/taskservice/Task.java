package taskservice;

/*
 * Task class represents a task with an ID, name, and description.
 */

public class Task {
	
	//Task fields- ID cannot change, name & description can be updated.
	private final String taskId;
	private String name;
	private String description;
	
	
	//Creates a task using an ID, name, and description.
	//Task ID is needed and can't be longer than 10 characters
	//Task name can't be longer than 20 characters
	//Task description can't be longer than 50 characters
	public Task(String taskId, String name, String description) {
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid task ID");
		}
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid task name");			
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid task description");
		}
		
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	
	//Getter to return a task's information
	public String getTaskId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription () {
		return description;
	}

	
	//Setters to update name and description
	public void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid task name");
		}
		
		this.name = name;
	}
	
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid task description");
		}
		
		this.description = description;
			
	}
	
	
	
}
