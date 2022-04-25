
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AddContact {
    static Scanner scanner = new Scanner(System.in);
    static String contactName;
    static String contactLastName;
    static String contactNumber;



    public AddContact(String contactName, String contactLastName, String contactNumber) {
        AddContact.contactName = contactName;
        AddContact.contactLastName = contactLastName;
        AddContact.contactNumber = contactNumber;

    }
//

    public static void askName() {
        System.out.println("Whats their FIRST name?");
        contactName = scanner.next();
        System.out.println("Whats their LAST name?");
        contactLastName = scanner.next();
        System.out.println("Whats their number?");
        contactNumber = scanner.next();
    }

    public static void add() {
        askName();
        tryCatchAdd();
    }

    public static void tryCatchAdd() {
        try {
            FileWriter myWriter = new FileWriter("contacts.txt", true);
            myWriter.write(contactName.toUpperCase(Locale.ROOT) + " " + contactLastName.toUpperCase(Locale.ROOT) + " | (" + contactNumber.substring(0,3)+ ")-" +contactNumber.substring(3,6)+ "-" +contactNumber.substring(6,10)  + "\n");
            myWriter.close();
//
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static String getContactName() {
        return contactName;
    }

    public static void setContactName(String contactName) {
        AddContact.contactName = contactName;
    }

    public static String getContactNumber() {
        return contactNumber;
    }

    public static void setContactNumber(String contactNumber) {
        AddContact.contactNumber = contactNumber;
    }
}
