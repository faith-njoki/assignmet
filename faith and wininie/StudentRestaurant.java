import java.util.ArrayList;
import java.util.Scanner;

public class StudentRestaurant {
    private static final ArrayList<String> foodItems = new ArrayList<String>();
    private static final ArrayList<Double> foodPrices = new ArrayList<Double>();
    private static final ArrayList<String> drinkItems = new ArrayList<String>();
    private static final ArrayList<Double> drinkPrices = new ArrayList<Double>();
    private static final ArrayList<String> orderedItems = new ArrayList<String>();
    private static final ArrayList<Double> orderedPrices = new ArrayList<Double>();
    private static final double total = 0.0; // declare total as instance variable to store the current order total
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialize scanner object
        initializeMenu(); // add initial items to the menu
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. View menu");
            System.out.println("2. Add item to menu");
            System.out.println("3. Order food and drink");
            System.out.println("4. View order");
            System.out.println("5. Make payment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            switch (choice) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addMenuItem(scanner);
                    break;
                case 3:
                    orderFoodAndDrink(scanner);
                    break;
                case 4:
                    viewOrder();
                    break;
                case 5:
                    makePayment();
                    break;
                case 6:
                    System.out.println("Thank you for using the Student Restaurant app!");
                    scanner.close(); // close scanner object before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
   
    public static void initializeMenu() {
        // Add some initial items to the menu
        foodItems.add("Pizza");
        foodPrices.add(10.00);
        foodItems.add("Burger");
        foodPrices.add(8.00);
        drinkItems.add("Coke");
        drinkPrices.add(2.00);
        drinkItems.add("Water");
        drinkPrices.add(1.00);
    }
   
    public static void displayMenu() {
        System.out.println("=== MENU ===");
        System.out.println("FOOD:");
        for (int i = 0; i < foodItems.size(); i++) {
            System.out.println(foodItems.get(i) + " - eur" + foodPrices.get(i));
        }
        System.out.println("DRINKS:");
        for (int i = 0; i < drinkItems.size(); i++) {
            System.out.println(drinkItems.get(i) + " - eur" + drinkPrices.get(i));
        }
    }
   
    public static void addMenuItem(Scanner scanner) {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        System.out.print("Is this a food or a drink? ");
        String type = scanner.nextLine().toLowerCase();
       
        switch (type) {
            case "food":
                foodItems.add(item);
                foodPrices.add(price);
                break;
            case "drink":
                drinkItems.add(item);
                drinkPrices.add(price);
                break;
            default:
                System.out.println("Invalid item type. Item not added.");
                break;
        }
        System.out.println("Item added successfully.");
    }

    private static void orderFoodAndDrink(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viewOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void makePayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}