import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class HackerTerminal {

    static Scanner scanner = new Scanner(System.in);
    static String anaf = anafPasswords();
    static String shuffle = scramble(anaf);

    public static void main(String[] args) {


        do {
            displayMenu();
            int option = getOption();

            if (option == 1) {
            hackANAF();            }
            else if (option == 2) {
                hackCNASS();
            }
            else if (option == 3) {
                hackWIFI();
            }
            else if (option == 4) {
                System.out.println("Exiting....");
                break;
            }
        } while (true);

    }

    static void displayMenu() {
        System.out.println("Hacking Terminal initializing....");
        System.out.println("Stand by....");
        System.out.println("\nWelcome");

        System.out.println("Organizations available for hacking: ");


        System.out.println("_________________________");
        System.out.println("\n- Main Interface -");
        System.out.println("1. ANAF");
        System.out.println("2. CNASS");
        System.out.println("3. Your neighbour's WI-FI");
        System.out.println("4. Exit.");
    }

    static int getOption() {
        System.out.print("Select organization:");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void hackANAF() {
        System.out.print("Enter your password (hint: " + shuffle + "):");
        String password;
        String menu;
        int count = 0;


        do {
            password = scanner.next();
            if (password.equals(anaf)) {
                System.out.println("You have successfully hacked into ANAF.");
                System.out.println("Write \"menu\" to get back to the Menu screen.");
            } else {
                System.out.println("Wrong password. Try again!");
            }

        } while (!password.equals(anaf));


        do {
            menu = scanner.next();
            if (menu.equals("menu")) {
                break;
            } else {
                System.out.println("Command not found.");
            }
        } while (true);


        /*do {
            password = scanner.next();
            System.out.println("Wrong password. Try again!");
            count++;

        } while (!password.equals(anaf) || count < 2);


        System.out.println("You have successfully hacked into ANAF.");
        System.out.println("Write \"menu\" to get back to the Menu screen.");

        do {
            menu = scanner.next();
            if (menu.equals("menu")) {
                break;
            } else {
                System.out.println("Command not found.");
            }
        } while (true);*/
    }

        static void hackCNASS() {

    }

    static void hackWIFI() {

    }

    static String anafPasswords() {
        ArrayList<String> passwordsANAF = new ArrayList<String>();
        passwordsANAF.add("justice");
        passwordsANAF.add("power");
        passwordsANAF.add("slavlife");
        passwordsANAF.add("busted");
        passwordsANAF.add("wrath");

        Random rand = new Random();
        String randomElement = passwordsANAF.get(rand.nextInt(passwordsANAF.size()));
        return randomElement;
    }

    static String scramble(String bah) {

        List<String> letters = Arrays.asList(bah.split(""));
        Collections.shuffle(letters);
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }
}


