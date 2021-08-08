package EventReader;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Event {
    String Id;
    String Type;
    String InsuredId;
    List<Product> Product;

    public Event() {
    }

    public Event(String id, String type, String insuredId, List<Product> product) {
        super();
        Id = id;
        Type = type;
        InsuredId = insuredId;
        Product = product;
    }

    @XmlElement(name="Id")
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }

    @XmlElement(name="Type")
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    @XmlElement(name="InsuredId")
    public String getInsuredId() {
        return InsuredId;
    }
    public void setInsuredId(String insuredId) {
        InsuredId = insuredId;
    }

    @XmlElement(name="Product")
    public List<Product> getProduct() {
        return Product;
    }
    public void setProduct(List<Product> product) {
        Product = product;
    }
}
