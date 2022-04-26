import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    public MainMenu() {

    }
   protected static int number;
    public static void displayMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: view contacts\n2: add new\n3: search contacts\n4: delete contacts\n5: exit app\nEnter an option (1, 2, 3, 4 ,5)");
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
            System.out.println("--- contact list updated ---\n");
        } else if (menuOption.equals("3")) {
            SearchContacts.searchFeature();
            ExitOrMenu.ExitOrMenu();
        }else if(menuOption.equals("4")){
            DeleteContact.deleteFeature();
            ExitOrMenu.ExitOrMenu();
        }else if (menuOption.equals("5")){
            System.out.println("Goodbye :)");
        }else{
            System.out.println("--- INVALID RESPONSE ---");
            MainMenu.displayMenu();
        }
    }
}
