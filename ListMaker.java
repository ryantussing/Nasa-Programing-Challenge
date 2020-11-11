package moonmapingproject;

import java.io.BufferedReader;
import processing.core.PApplet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author 679213
 */
public class ListMaker {
    File values;
    String[]temp;
    
    /**
     * Finds the CSV file that needs to be read, goes through it and converts
     * each row into a string.
     * @return the array of strings taken from the CS file
     */
    public String[] readFile() throws FileNotFoundException{
        //Two BufferedReaders are made, one to read the file, and one to count the number of lines.
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/679213/Documents/fy20_adc_data_file_88_degrees.csv"));
        BufferedReader lineCounter = new BufferedReader(new FileReader("C:/Users/679213/Documents/fy20_adc_data_file_88_degrees.csv"));
        //A string which will hold the next line of the buffered reader, and an int for the line count.
        String line = null;
        int lineCount = 0;
  
        try {
            //As long as the next line of the file isn't Null, add to the line 
            //count
            while ((line = lineCounter.readLine()) != null) {
                lineCount++; 
            }
            //prints line count and closes the loneCounter reader
            System.out.println(lineCount);
            lineCounter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
  
        try {
            //creates a 3d array of Strings which will have the values filled in
            String[] values = new String[lineCount];
            int place = 0;
            
            //reads each line, and splits them at the commas.
            while ((line = reader.readLine()) != null) {
                values[place] = line;
                place++;
            }
            //Set the return string equal to the values we just found, prints 
            //that everything is done, close the second buffered reader
            temp = values;
            System.out.println("complete");
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        //returns the array of strings
        return temp;
    }
}
