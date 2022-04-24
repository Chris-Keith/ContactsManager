import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddContact {
    static Scanner scanner = new Scanner(System.in);
    static String contactName;
    static String contactLastName;
    static int contactNumber;

    public AddContact(String contactName, String contactLastName, int contactNumber) {
        this.contactName = contactName;
        this.contactLastName = contactLastName;
        this.contactNumber = contactNumber;

    }

    public static void askName() throws IOException {
        System.out.println("Whats their FIRST name?");
        contactName = scanner.nextLine();
        System.out.println("Whats their LAST name?");
        contactLastName = scanner.nextLine();
        System.out.println("Whats their number?");
        contactNumber = scanner.nextInt();
        phoneNumberChecker();
    }

    public static void add() throws IOException {
        AddContact newContact = new AddContact(contactName, contactLastName, contactNumber);
        askName();
        tryCatchAdd(newContact);
    }

    public static void tryCatchAdd(AddContact newContact) {
        try {
            FileWriter myWriter = new FileWriter("contacts.txt", true);
            myWriter.write("\n"+"Name    |    Phone Number\n"+
                    "----------------"
                    + contactName + " " + contactLastName + " | " + contactNumber);
            myWriter.close();
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void phoneNumberChecker() throws IOException {
        if (String.valueOf(contactNumber).length() == 10) {
            System.out.println("nice");


        } else if(String.valueOf(contactNumber).length() != 10){
            System.out.println("invalid entry, please enter a 10 digit number");
            MainMenu.displayMenu();
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
