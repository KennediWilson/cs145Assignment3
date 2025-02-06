import java.io.BufferedReader; // read text from a character-input stream
import java.io.FileReader; // read text files
import java.io.FileNotFoundException; // exception that is thrown when trying to access a file that does not exist
import java.io.IOException;// signals that an I/O exception of some sort has occurred

public class AnimalManager {
    public static void main(String[] args) { 
        Animal[] animals = { //Array of animals
            new Cow(),
            new Fish(),
            new Snake()
        };

        // Enhanced for loop that executes every method for every class
        for (Animal x : animals) {
            x.speak();
            x.habitat();
            x.typesOf();
        }

        try { //try to read file
            readFile("Animal.txt");
        } catch (FileNotFoundException e) { //catch exception if file not found
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) { //catch exception if file not found
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException { //method to read file
        BufferedReader reader = null; //initialize reader
        try {//try to read file
            reader = new BufferedReader(new FileReader(fileName));
            String line;//initialize line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {//close reader
            if (reader != null) {
                reader.close();
            
            }//end of if
        }//end of try/catch
    }//end of readFile method
}//end of AnimalManager.java
