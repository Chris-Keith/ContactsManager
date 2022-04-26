import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RenderContacts {
    public static void render() {
        try {
            File myObj = new File("contacts.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("\n"+"| Name                | Phone Number     |\n"+
                    "__________________________________________");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
