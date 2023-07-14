package BdsShop.Dto;

import java.sql.Date;

public class ProductsRentsDto {
	private int id_product;
	private int id_categoryrent;
	private String name;
	private String address;
	private int bedroom;
	private int barthroom;
	private String area;
	private String price;
	private int rents;
	private String status;
	private Date created_at;
	private Date updated_at;
	public int getRents() {
		return rents;
	}

	public void setRents(int rents) {
		this.rents = rents;
	}
	private String id_img;
	
	
	public ProductsRentsDto() {
		super();
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	public int getId_categoryrent() {
		return id_categoryrent;
	}
	public void setId_categoryrent(int id_categoryrent) {
		this.id_categoryrent = id_categoryrent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getBarthroom() {
		return barthroom;
	}
	public void setBarthroom(int barthroom) {
		this.barthroom = barthroom;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId_img() {
		return id_img;
	}
	public void setId_img(String id_img) {
		this.id_img = id_img;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
