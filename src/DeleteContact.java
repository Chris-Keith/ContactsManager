import java.io.*;


public class DeleteContact {

    public static void deleteFeature() throws IOException {
        System.out.println("--- enter a name to delete ---");
        String userDeleteContact = AddContact.scanner.nextLine();
        BufferedReader deletebuff = new BufferedReader(new FileReader("contacts.txt"));
        String deleteline;
        while ((deleteline = deletebuff.readLine()) != null) {
            if (deleteline.contains(userDeleteContact)) {
                System.out.println("found");
                System.out.println(deleteline);
            }


            }

        }


}
