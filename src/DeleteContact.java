import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

//public class DeleteContact {
//    static Scanner scanner = new Scanner(System.in);
//    static String contactName;
//
//    public DeleteContact(String contactName) {
//        this.contactName = contactName;
//    }
//
//    public static void deleteName() {
//        System.out.println("Who to delete?");
//        contactName = scanner.next();
//    }
//
//    public static void delete() {
//        DeleteContact oldContact = new DeleteContact(contactName);
//        deleteName();
//        tryCatchDelete(oldContact);
//    }
//
//    public static void tryCatchDelete(DeleteContact oldContact) {
//        try {
//            Files.deleteIfExists(Paths.get("/Users/Ava/IdeaProjects/ContactsManager/contacts.txt"));
//        } catch (NoSuchFileException ex) {
//            System.out.println("User does not exist");
//        } catch (DirectoryNotEmptyException ex) {
//            System.out.println("Directory is not empty");
//        } catch (IOException ex) {
//            System.out.println("Invalid permission");
//        }
//        System.out.println("Deletion was successful");
//
//    }
//}

public class DeleteContact {
    BufferedReader reader = new BufferedReader(new FileReader("src/contacts.txt"));

    public String readLines (BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while (line = reader.readLine() != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
    }
}

