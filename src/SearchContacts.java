import java.io.*;
import java.util.Locale;


public class SearchContacts {

    public static void searchFeature() throws IOException {
        System.out.println("enter a name...");
        String userSearchContact = AddContact.scanner.nextLine();
        BufferedReader buff = new BufferedReader(new FileReader("contacts.txt"));
        String line;
        while ((line = buff.readLine()) != null) {
            if (line.contains(userSearchContact.toUpperCase(Locale.ROOT))) {
                System.out.println("\n" + line.toUpperCase(Locale.ROOT) + "\n");
            }


        }
        ExitOrMenu.ExitOrMenu();
        System.out.println("\nno contact found\n");




    }


}





