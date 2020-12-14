/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

/**
 *
 * @author dpie
 */
import com.openaire.openaireapifordspace.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.ValidationEventCollector;

public class JAXBXMLHandler {
 
    // Export: Marshalling
    public static void marshal(Employee employee, File selectedFile)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(Employee.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(employee, writer);
        writer.close();
    }
 /*
    // Import: Unmarshalling
    public static Employee unmarshal(File importFile) throws JAXBException {
        Employee employee = null;
        JAXBContext context;
 
        context = JAXBContext.newInstance(Employee.class);
        Unmarshaller um = context.createUnmarshaller();
        employee = (Employee) um.unmarshal(importFile);
 
        return employee;
    }
    */
    // Import: Unmarshalling
    public static Response unmarshal(File importFile) throws JAXBException, MalformedURLException, ProtocolException, IOException {
/*
        String uri ="https://api.openaire.eu/search/projects?grantID=777541";
URL url = new URL(uri);
HttpURLConnection connection =
    (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
connection.setRequestProperty("Accept", "application/xml");

//JAXBContext jc = JAXBContext.newInstance(Customer.class);
InputStream xml = connection.getInputStream();
//Customer customer =
//    (Customer) jc.createUnmarshaller().unmarshal(xml);

//connection.disconnect();
*/
        Response response = null;
        JAXBContext context;
 
        context = JAXBContext.newInstance(Response.class);
        Unmarshaller um = context.createUnmarshaller();

        response = (Response) um.unmarshal(importFile);
 
        return response;
    }
}    
