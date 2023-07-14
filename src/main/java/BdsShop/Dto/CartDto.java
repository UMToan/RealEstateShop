package BdsShop.Dto;

public class CartDto {
	private int quanty;
	private	String totalPrice;
	private ProductsDto product;
	
	public CartDto() {

	}
	
	public CartDto(int quanty, String totalPrice, ProductsDto product) {
		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.product = product;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ProductsDto getProduct() {
		return product;
	}
	public void setProduct(ProductsDto product) {
		this.product = product;
	}
}
