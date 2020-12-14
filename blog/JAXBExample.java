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
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBException;
 
public class JAXBExample {
    public static void main(String[] args) throws Exception{
 
         
        try {
            //Marshalling: Writing Java object to XML file
            //JAXBXMLHandler.marshal(employee, new File("employee.xml"));
         
            //Unmarshalling: Converting XML content to Java objects
            //Employee employee2 = JAXBXMLHandler.unmarshal(new File("/Users/dpie/Dropbox/Research/Projects/OpenAIRE API DSpace/openaireapifordspace/file.xml"));
            Response response = JAXBXMLHandler.unmarshal(new File("/Users/dpie/Dropbox/Research/Projects/OpenAIRE API DSpace/openaireapifordspace/openaire_api.xml"));
            System.out.println(response.getHeader());  
            
        } 
        catch (JAXBException e) {
            e.printStackTrace();
        }       
    }
}
