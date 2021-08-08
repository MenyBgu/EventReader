package EventReader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class RequestDetails {

	String Id;
	String AcceptDate;
	String SourceCompany;

	public RequestDetails() {
	}

	public RequestDetails(String id, String acceptDate, String sourceCompany) {
		super();
		Id = id;
		AcceptDate = acceptDate;
		SourceCompany = sourceCompany;
	}

	@XmlElement(name="Id")
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@XmlElement(name="AcceptDate")
	public String getAcceptDate() {
		return AcceptDate;
	}

	public void setAcceptDate(String acceptDate) {
		AcceptDate = acceptDate;
	}

	@XmlElement(name="SourceCompany")
	public String getSourceCompany() {
		return SourceCompany;
	}

	public void setSourceCompany(String sourceCompany) {
		SourceCompany = sourceCompany;
	}

}
