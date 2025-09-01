
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int age;
    static String email;
    static String adress;
    static String phone;
    static double height;
    static double weight;
    static boolean hasDriversLicense;
    static boolean hasPets;
    static int petCount;


    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Maak je keuze: ");
            int startKeuze = scanner.nextInt();
            scanner.nextLine();
            if (startKeuze == 0) {
                System.out.println("Afsluiten. Tot ziens!");
                scanner.close();
                return;
            } else if (startKeuze == 1) {
                setName();
            }
//            Schrijf hier de if-statements waarin je de juiste methode aanroept.

            else {
                System.out.println("Onbekende optie. Kies een nummer uit het menu.");
            }
            System.out.println();

        }
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de app van " + name);
        System.out.println("Kies een optie:");
        System.out.println(" 0  - Afsluiten");
        System.out.println(" 1  - Vul naam in");
//        Vul hier het menu aan

    }

    private static void printProfile() {
        System.out.println(); // witruimte
        System.out.println("----- PROFIEL -----");
        if(name != null) {
            System.out.println("Naam: " + name);
        } else {
            System.out.println("Naam: niet ingevuld");
        }
//        Vul hier de conditionele prints in voor alle variabelen




        System.out.println("-------------------");
    }

    private static void setName() {
        System.out.print("Voer je volledige naam in: ");
        String input = scanner.nextLine().trim();
        if(input.length() > 0) {
            name = input;
            System.out.println("Naam opgeslagen: " + name);
        } else {
            System.out.println("Ongeldige naam. Niet opgeslagen.");
        }
    }

//        Schrijf hier de andere methodes






}
