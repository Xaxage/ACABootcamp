import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt");
             FileWriter writer = new FileWriter("writer")) {
            System.out.println("File opened");
            /*reader.close();//Reader should be closed,
            // but if we catch an exception we dont get to this line .
            //So we use Finally block, cause outside of try block we cant
            //see the reader.*/
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {//If it is up, it won't work, cause polymorphism EXISTS
            System.out.println("Sss");
        }
    }
}

