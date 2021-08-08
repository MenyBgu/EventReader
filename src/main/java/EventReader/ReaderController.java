package EventReader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReaderController {
    @GetMapping("/events")
    public Root getAllEvents() {
        Root root=XmlToObject.getXml();
		return root;
    }

/*    @GetMapping("/event/insuredid/sourcecompany")
    public Root getEvenByInsuredIdAndSourceCompany() {
        Root root=XmlToObject.getXml();
        return root;
    }*/
}
