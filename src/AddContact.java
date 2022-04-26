
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

    public static void add() throws IOException {
        askName();
        tryCatchAdd();
    }

    public static void tryCatchAdd() throws IOException {
        String var = null;
        String var2 = null;
        if (contactNumber.length() == 10) {
            var = contactName.toUpperCase(Locale.ROOT) + " " + contactLastName.toUpperCase(Locale.ROOT);
            var2 = " | (" + contactNumber.substring(0, 3) + ")-" + contactNumber.substring(3, 6) + "-" + contactNumber.substring(6, 10);
            try {
                FileWriter myWriter = new FileWriter("contacts.txt", true);
                String formattedsString = String.format("|%-20s", " " + var);
                String formattedString2 = String.format("%-20s|\n", var2);
                myWriter.write(formattedsString + formattedString2);
                System.out.println("--- contact list updated ---\n");
                myWriter.close();

            } catch (
                    IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else if(contactNumber.length() == 7){
            String var3 = contactName.toUpperCase(Locale.ROOT) + " " + contactLastName.toUpperCase(Locale.ROOT);
            String var4 = " |       " + contactNumber.substring(0, 3) + "-" + contactNumber.substring(3, 7);
            try {
                FileWriter myWriter = new FileWriter("contacts.txt", true);
                String formattedsString = String.format("|%-20s", " " + var3);
                String formattedString2 = String.format("%-20s|\n", var4);
                myWriter.write(formattedsString + formattedString2);
                System.out.println("--- contact list updated ---\n");
                myWriter.close();

            } catch (
                    IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }else {
            System.out.println("Invalid phone number please try again...");
            askName();
            System.out.println("Invalid phone number...");
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
