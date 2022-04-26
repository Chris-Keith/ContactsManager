
import java.io.*;
import java.nio.file.Files;
import java.util.Locale;


public class DeleteContact {

    public static void deleteFeature() throws IOException {
        System.out.println("--- DELETE CONTACT ---");
        RenderContacts.render();
        System.out.println("First Name?");
        String userDeleteContactFirstName = AddContact.scanner.next();
//        System.out.println("Last Name?");
//        String userDeleteContactLastName = AddContact.scanner.nextLine();
//        System.out.println("Number?");
//        int userDeleteContactNumber = AddContact.scanner.nextInt();
//        System.out.println("Who do you want to delete? (choose which number)");
//        int userDeleteIdNumber = AddContact.scanner.nextInt();


        File file = new File("contacts.txt");
        File temp = new File("contacts-temp.txt");
        PrintWriter deleteContact = new PrintWriter(new FileWriter(temp));
          Files.lines(file.toPath())
               .filter(line -> !line.contains(userDeleteContactFirstName.toUpperCase(Locale.ROOT)))
                .forEach(deleteContact::println);
        deleteContact.flush();
        deleteContact.close();
        temp.renameTo(new File("contacts.txt"));
//        if(line.contains(userDeleteContactFirstName + " " + userDeleteContactLastName))
        System.out.println(userDeleteContactFirstName + " was deleted...\n");

    }


}
