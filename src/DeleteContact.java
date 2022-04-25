import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.file.Files;


public class DeleteContact {

    public static void deleteFeature() throws IOException {
        System.out.println("--- DELETE CONTACT ---");
        System.out.println("First Name?");
        String userDeleteContactFirstName = AddContact.scanner.nextLine();
        System.out.println("Last Name?");
        String userDeleteContactLastName = AddContact.scanner.nextLine();


        File file = new File("contacts.txt");
        File temp = new File("contacts-temp.txt");
        PrintWriter deleteContact = new PrintWriter(new FileWriter(temp));
          Files.lines(file.toPath())
               .filter(line -> !line.contains(userDeleteContactFirstName + " " + userDeleteContactLastName))
                .forEach(deleteContact::println);
        deleteContact.flush();
        deleteContact.close();
        temp.renameTo(new File("contacts.txt"));
//        if(line.contains(userDeleteContactFirstName + " " + userDeleteContactLastName))
        System.out.println(userDeleteContactFirstName + " was deleted...\n");

    }


}
