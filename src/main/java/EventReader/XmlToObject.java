package EventReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XmlToObject {
    private static final Logger logger = LoggerFactory.getLogger(XmlToObject.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Value("${name}")
    private static String location;

    //TODO Configuration to Both - TimeAppConsume , FileLocation
    //TODO Consume data one to hour
    //TODO on memory DB to hold the fresh data?

    public static Root getXml() {
        try {
            File f = new File("C:/Users/menyb/Downloads/Request.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Root root = (Root) jaxbUnmarshaller.unmarshal(f);

//            H2jdbc connector = new H2jdbc();
//            root.
//            connector.execute();

            return root;

        } catch (JAXBException e) {
            e.printStackTrace();
            return null;

        }
    }
    @Scheduled(fixedDelay = 5000)
    public static void scheduleTaskWithFixedRate() {
        logger.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }
}