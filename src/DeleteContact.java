
import java.io.*;
import java.nio.file.Files;
import java.util.Locale;


public class DeleteContact {

    public static void deleteFeature() throws IOException {
        System.out.println("--- DELETE CONTACT ---");
        RenderContacts.render();
        System.out.println("First Name?");
        String userDeleteContactFirstName = AddContact.scanner.next();

        File file = new File("contacts.txt");
        File temp = new File("contacts-temp.txt");
        PrintWriter deleteContact = new PrintWriter(new FileWriter(temp));
          Files.lines(file.toPath())
               .filter(line -> !line.contains(userDeleteContactFirstName.toUpperCase(Locale.ROOT)))
                .forEach(deleteContact::println);
        deleteContact.flush();
        deleteContact.close();
        temp.renameTo(new File("contacts.txt"));
        System.out.println(userDeleteContactFirstName + " was deleted...\n");

    }


}
