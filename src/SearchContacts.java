import java.util.ArrayList;

public class SearchContacts extends AddContact{

    ArrayList<String> search;

    public SearchContacts(String contactName, int contactNumber) {
        super(contactName, contactNumber);
    }

    public void searchContacts(String contactName) {
        this.search = new ArrayList<>();
        this.contactName = contactName;
    }

    public void contactsList() {

    }

    public void searchName() {
        System.out.println("Whats their name?");
        contactName = scanner.next();

        this.search.render();
}
