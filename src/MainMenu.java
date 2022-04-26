import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    public MainMenu() {

    }
   protected static int number;
    public static void displayMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________\n");
//        System.out.println("\uD83C\uDD52\uD83C\uDD5E\uD83C\uDD5D\uD83C\uDD63\uD83C\uDD50\uD83C\uDD52\uD83C\uDD63\uD83C\uDD62 \uD83C\uDD50\uD83C\uDD5F\uD83C\uDD5F");
        System.out.println("1: View Contacts\n2: Add Contacts\n3: Search Contacts\n4: Delete Contacts\n5: Exit App\nEnter an option (1, 2, 3, 4 ,5)\n");
        System.out.println("_______________________________");
        String menuOption = scanner.nextLine();
        if (!Objects.equals(menuOption, "1") && !Objects.equals(menuOption, "2") && !Objects.equals(menuOption, "3") && !Objects.equals(menuOption, "4") && !Objects.equals(menuOption, "5")) {
            System.out.println("--- Invalid Response ---");
            MainMenu.displayMenu();
        } else if (menuOption.equals("1")) {
            RenderContacts.render();
            ExitOrMenu.ExitOrMenu();
            System.out.println("\n");
        } else if (menuOption.equals("2")) {
            AddContact.add();
            ExitOrMenu.ExitOrMenu();
        } else if (menuOption.equals("3")) {
            SearchContacts.searchFeature();
        }else if(menuOption.equals("4")){
            DeleteContact.deleteFeature();
            ExitOrMenu.ExitOrMenu();
        }else if (menuOption.equals("5")){
            System.out.println("Goodbye :)");
            System.exit(0);
        }else{
            System.out.println("--- INVALID RESPONSE ---");
            MainMenu.displayMenu();
        }
    }
}
