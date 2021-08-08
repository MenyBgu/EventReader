package EventReader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@XmlRootElement(name="Root")
@Entity
@Table(name = "root")
public class Root {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id)
    RequestDetails RequestDetails;
    List<Event> Event;

    public Root() {
    }

    public Root(RequestDetails requestDetails, List<Event> event) {
        super();
        RequestDetails = requestDetails;
        Event = event;
    }

    @XmlElement(name="RequestDetails")
    public RequestDetails getRequestDetails() { return RequestDetails; }
    public void setRequestDetails(RequestDetails requestDetails) { RequestDetails = requestDetails; }

    @XmlElement(name="Event")
    public List<Event> getEvent() { return Event; }
    public void setEvent(List<Event> event) { Event = event; }
}
