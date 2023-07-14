package BdsShop.Entity;

public class billDetail {
	private int id;
	private int id_products;
	private long id_bills;
	
	private int quanty;
	private String total;
	
	public billDetail() {
		super();
	}
	public long getId_bills() {
		return id_bills;
	}

	public void setId_bills(long idBills) {
		this.id_bills = idBills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_products() {
		return id_products;
	}
	public void setId_products(int id_products) {
		this.id_products = id_products;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String string) {
		this.total = string;
	}
	
	
}
