package EventReader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Product {

	String Type;
	String Price;
	String StartDate;
	String EndDate;

	public Product() {
	}

	public Product(String type, String price, String startDate, String endDate) {
		super();
		Type = type;
		Price = price;
		StartDate = startDate;
		EndDate = endDate;
	}

	@XmlElement(name="Type")
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}

	@XmlElement(name="Price")
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}

	@XmlElement(name="StartDate")
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	@XmlElement(name="EndDate")
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
}
