import java.util.ArrayList;

/**
 * A job that needs to be contracted for a construction site.
 * @author Matt Duggan
 */
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * The parameters that define a contract. 
	 * @param title The title of the job. 
	 * @param description A description of what the job will do.
	 * @param price The price it will be to do the job. 
	 * @param contact who to contact about the job
	 * @param supplies The list of items they will need to do the job.
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title =  title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * Grabs the price of the job. 
	 * @return The price of the job. 
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Creates an output for each item in the constructors to do list. 
	 * @return A printed display of each job. 
	 */
	public String toString() {
		String supplyList = "";
		for(int i = 0; i < this.supplies.size(); i++) {
			supplyList = supplyList + "\n-" + supplies.get(i);
		}
		
		return "\n***** " + this.title + " *****\n" + this.description + "\n" + "Business Contact: " + this.contact + "\nSupplyList: " + supplyList + "\nPrice: " + this.price;
	}
}
