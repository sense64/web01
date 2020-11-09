package edu.donga;

public class Product {
	private String productId; //상품아이디
	private String pName;     //상품명
	private int unitPrice; //상품가격
	private String designer; //상품디자이너
	private String category; //상품 분류
	

	public Product() { }
	public Product(String productId, String pName, int unitPrice, String designer, String category) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.unitPrice = unitPrice;
		this.designer = designer;
		this.category = category;
		
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
