
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

    public static void askName() {
        System.out.println("Whats their FIRST name?");
        contactName = scanner.next();
        System.out.println("Whats their LAST name?");
        contactLastName = scanner.next();
        System.out.println("Whats their number?");
        contactNumber = scanner.next();
//        if(put file reader here finds a match){
//            ask to overwrite
//                    scanner if they want to overwrite
//        file writer that line with new information
//        }
    }

    public static void add() {
        askName();
        tryCatchAdd();
    }

    public static void tryCatchAdd() {
        String var =contactName.toUpperCase(Locale.ROOT) + " " + contactLastName.toUpperCase(Locale.ROOT);
        String var2 = " | (" + contactNumber.substring(0,3)+ ")-" +contactNumber.substring(3,6)+ "-" +contactNumber.substring(6,10);
        String formattedsString = String.format("|%-20s"," "+ var);
        String formattedString2 = String.format("%-20s|\n", var2);
        try {
            FileWriter myWriter = new FileWriter("contacts.txt", true);
            myWriter.write(formattedsString + formattedString2);
            myWriter.close();

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
