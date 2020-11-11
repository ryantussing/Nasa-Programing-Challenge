package moonmapingproject;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 679213
 */
public class MoonMapingProject {
    
    
    public static void main(String[] args){
        String[] values;
        
        try {
            //Makes a new ListMaker class to read the file
            ListMaker listMaker = new ListMaker();
            
            //tells listMaker to run the readFile method, and sets values equal to what is returned
            values = listMaker.readFile();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        }
    }
}
