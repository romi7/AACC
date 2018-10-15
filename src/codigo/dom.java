/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author tripl
 */ 
public class dom{ 
     Document doc = null; 
    public int abrir_XML_DOM (File fichero){   
        
         try{ 
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
             factory.setIgnoringComments(true); 
             DocumentBuilder builder = factory.newDocumentBuilder(); 
             doc = (Document) builder.parse(fichero);
             
                return 0;
         }catch (Exception e){ 
             e.printStackTrace(); 
             return -1;
         }
     
        
        
    }
    
}
