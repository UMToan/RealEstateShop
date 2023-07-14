package BdsShop.Entity;

public class CategorysRents {
	private int id_rents;
	private String name;
	private String description;
	
	public CategorysRents() {
		super();
	}
	
	public int getId() {
		return id_rents;
	}
	public void setId(int id_rents) {
		this.id_rents = id_rents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}