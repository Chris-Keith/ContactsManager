import java.io.*;
import java.util.ArrayList;
import java.util.Locale;


public class SearchContacts extends AddContact {

    ArrayList<String> search;

    public SearchContacts(String contactName, int contactNumber) {
        super(contactName, contactNumber);
    }

//    public void searchContacts(String contactName) {
//        this.search = new ArrayList<>();
//        this.contactName = contactName;
//    }

    public void contactsList() {
        System.out.println("Enter a contact to search...");
    }

//    public void searchName() {
//        System.out.println("Whats their name?");
//        contactName = scanner.next();
//
//        this.search.render();

    public static void searchTryCatch() throws IOException {
        System.out.println("enter a name...");
        String userSearchContact = scanner.nextLine();

        BufferedReader buff = new BufferedReader(new FileReader("contacts.txt"));
        String line;
        while ((line = buff.readLine()) != null) {
            if (line.contains(userSearchContact)) {
                System.out.println("\n" + line.toUpperCase(Locale.ROOT) + "\n");
                MainMenu.displayMenu();
            }

        }
        System.out.println("\nno contact found\n");

    }


}





