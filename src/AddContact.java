import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddContact {
    static Scanner scanner = new Scanner(System.in);
    static String contactName;
    static int contactNumber;

    public AddContact(String contactName, int contactNumber) {
        this.contactName = contactName;
        this.contactName = String.valueOf(contactNumber);

    }

    public static void askName() {
        System.out.println("Whats their name?");
        contactName = scanner.next();
        System.out.println("Whats their number?");
        contactNumber = scanner.nextInt();

    }

    public static void add() {
        AddContact newContact = new AddContact(contactName, contactNumber);
        askName();
        tryCatchAdd(newContact);
    }

    public static void tryCatchAdd(AddContact newContact) {
        try {
            FileWriter myWriter = new FileWriter("contacts.txt", true);
            myWriter.write("\n" + contactName +" | "+ contactNumber);
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

    public static int getContactNumber() {
        return contactNumber;
    }

    public static void setContactNumber(int contactNumber) {
        AddContact.contactNumber = contactNumber;
    }
}
