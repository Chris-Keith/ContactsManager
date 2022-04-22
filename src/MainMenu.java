import java.util.Scanner;

public class MainMenu {
    public MainMenu() {

    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: view contacts\n2: add new\n3: search contacts\n4: delete contacts\n5: exit app\nEnter an option (1, 2, 3, 4 ,5)");
        int menuOption = scanner.nextInt();
        if (menuOption != 1 && menuOption != 2 && menuOption != 3 && menuOption != 4 && menuOption != 5){
            System.out.println("--- Invalid Response ---");
            MainMenu.displayMenu();
        }
        else if (menuOption == 1) {
            RenderContacts.render();
            System.out.println("\n");
            MainMenu.displayMenu();
        } else if (menuOption == 2) {
            AddContact.add();
            System.out.println("--- contact list updated ---\n");
            MainMenu.displayMenu();
        }
    }
}
