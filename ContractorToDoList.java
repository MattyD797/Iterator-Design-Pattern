import java.util.ArrayList;
import java.util.Arrays;

/**
 * A list of all the jobs that a constructor must do. 
 * @author Matt Duggan
 */
public class ContractorToDoList {
	private String address;
	private ToDo[] todos;
	private int count;
	
	/**
	 * What constitutes a to do list for a constructor. 
	 * @param address The site that the constructor is working on. 
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		this.todos = new ToDo[2];
		this.count = 0;
	}
	
	/**
	 * This adds a job for the constructor to watch over at the site
	 * @param title The type of work that needs to be done at the site. 
	 * @param description A description of the work 
	 * @param price The total cost for doing this job. 
	 * @param contact The name responsible for this part of the project.
	 * @param supplies The list of supplies needed.
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if (todos.length == count) {
			todos = growArray(todos);
		}
		todos[count] = todo;
		count += 1;
	}
	
	/**
	 * Allows main to print all instances of a todo in the ToDo list for the constructor. 
	 * @return A new check for all the todo items. 
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
	
	/**
	 * Grabs teh address of the site. 
	 * @return The place the job is located. 
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Calculates the total cost of the price at the site. 
	 * @return The price from every todo. 
	 */
	public double getTotalCost() {
		double total = 0;
		for(ToDo todo : todos) {
			if(todo!=null) {
				total += todo.getPrice();
			}
		}
		return total;
	}
	
	/**
	 * Creates a new array twice the size. 
	 * @param todos The original list that needs to be expanded. 
	 * @return A new list with a larger size. 
	 */
	private ToDo[] growArray(ToDo[] todos) {
		todos = Arrays.copyOf(todos, todos.length*2);
		return todos;
	}
}
