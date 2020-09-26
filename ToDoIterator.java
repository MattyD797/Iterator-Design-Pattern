/**
 * The iterator class for the Todo List of a constructor.
 * @author Matt Duggan
 */
public class ToDoIterator implements Iterator{
	private ToDo[] todos;
	private int position;
	
	/**
	 * Assigns the list of items that the constructor needs to do
	 * @param todos The job list of the constructor. 
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * Checks the next element in the job list to see if it is null. 
	 * @return True or false if there is a job in the next index of the list. 
	 */
	public boolean hasNext() {
		return todos[position] != null && position < todos.length;
	}
	
	/**
	 * Moves the head or pointer to the next element in the list. 
	 * @return The job in the list. 
	 */
	public ToDo next() {
		if(!hasNext())return null;
		ToDo todo = todos[position];
		position += 1;
		return todo;
	}
}
