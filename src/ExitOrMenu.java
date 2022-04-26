
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ExitOrMenu {

    public static void ExitOrMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nReturn to main menu?");
        System.out.println("1: YES");
        System.out.println("2: NO");
        String menuYesNo = scanner.nextLine();
        if (Objects.equals(menuYesNo, "1")) {
            MainMenu.displayMenu();
        } else if (Objects.equals(menuYesNo, "2")) {
            System.out.println("Exit application?");
            System.out.println("1: NO");
            System.out.println("2: YES");
            String exitYesNo = scanner.nextLine();
            if (Objects.equals(exitYesNo, "1")) {
                MainMenu.displayMenu();
            }else {
                System.out.println("Goodbye :)");
                System.exit(0);
            }
        }
    }


}




