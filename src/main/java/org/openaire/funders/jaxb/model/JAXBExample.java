package org.openaire.funders.jaxb.model;

/*
 * To change this license header, choose License Headers in Project1 Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dpie
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

public class JAXBExample {

    public static void main(String[] args) throws MalformedURLException {

        try {
            //Unmarshalling: Converting XML content to Java objects
            URL url = new URL("https://api.openaire.eu/search/projects?grantID=741839&funder=EC");
            Response response = OpenAIREHandler.unmarshal(url);
            Result result = response.getResults().getResult();

            System.out.println("fdsfds " + response.getHeader().getTotal());

            Project project = result.getMetadata().getEntity().getProject();
            System.out.println(project);
            System.out.println("Funder name " + project.getFundingTreeType().getFunder().getName());

            //System.out.println(project.getCode());
            //System.out.println(project.getFundingTreeType().getFunder().getJurisdiction());
            //System.out.println("Project Code "+ project.getCode());
/*
            System.out.println("Funder name "+project.getFundingTreeType().getFunder().getName());
            System.out.println("Funder id "+project.getFundingTreeType().getFunder().getId());
            System.out.println("Funder Shortname: "+project.getFundingTreeType().getFunder().getShortname());
            System.out.println("Funding Stream: "+project.getFundingTreeType().getFunding_level1().getParent().getFundingLevel0().getName());
            System.out.println("Funding Stream: "+project.getFundingTreeType().getFunding_level1().getParent().getFundingLevel0().getDescription());
            System.out.println("Funding item name: "+project.getTitle());
            System.out.println("Funding item id: "+project.getCode());
            System.out.println("Funding item acronym: "+ project.getAcronym());
            System.out.println("Funder Jurisdiction: "+project.getFundingTreeType().getFunder().getJurisdiction());
             */
 /* dpie         
            //System.out.println(results.size());
            //for (int i = 0; i < results.size(); i++) {
                Result result = results.getResult();
                //System.out.println("Project1 code: "+result.getMetadata().getEntity().getProject().getCode());
                System.out.println("Funder Name: "+result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getName());
                System.out.println("Funder ID: "+result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getId());
                System.out.println("Funder Shortname: "+result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getShortname());
                
                if (result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1() != null) {
                    System.out.println("Funding Stream: "+result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getParent().getFundinglevel0().getName());
                    System.out.println("Funding Stream: "+result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getParent().getFundinglevel0().getDescription());
                }
                System.out.println("Funding item name: "+result.getMetadata().getEntity().getProject().getTitle());
                System.out.println("Funding item id: "+result.getMetadata().getEntity().getProject().getCode());
                System.out.println("Funding item acronym: "+ result.getMetadata().getEntity().getProject().getAcronym());
                System.out.println("Funder Jurisdiction: "+result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getJurisdiction());
dpie */
            //}
            /*
            Result result = results.get(0).getResult();
            /*System.out.println(result.getResultHeader().getDriObjectIdentifier());
            System.out.println(result.getResultHeader().getDateOfCollection());
            System.out.println(result.getResultHeader().getDateOfTransformation());
            System.out.println(result.getMetadata().getEntity().getProject().getStartdate());
            System.out.println(result.getMetadata().getEntity().getProject().getCode());
            System.out.println(result.getMetadata().getEntity().getProject().getContractType().getClassid());
            System.out.println(result.getMetadata().getEntity().getProject().getContractType().getClassname());
            System.out.println(result.getMetadata().getEntity().getProject().getContactfullname());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getShortname());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getId());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getClass1());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getParent().getFundinglevel0().getDescription());
             */
 /*
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getName());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getId());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getShortname());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getParent().getFundinglevel0().getName());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFundinglevel1().getParent().getFundinglevel0().getDescription());
            System.out.println(result.getMetadata().getEntity().getProject().getTitle());
            System.out.println(result.getMetadata().getEntity().getProject().getCode());
            System.out.println(result.getMetadata().getEntity().getProject().getAcronym());
            System.out.println(result.getMetadata().getEntity().getProject().getFundingTree().getFunder().getJurisdiction());
            
            
             */
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
