import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Meal meal = new Meal();

        int choice;

        System.out.println("Appetizers");
        System.out.println(" [01] Chicken Salad");
        System.out.println(" [02] Butter Cracker");
        System.out.println(" [03] Cheese Twist");
        System.out.println(" [04] Potato Bite");
        System.out.println(" Any other key to skip");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    meal.setAppetizer(DishFactory.createAppetizer("ChickenSalad"));
                    break;
                case 2:
                    meal.setAppetizer(DishFactory.createAppetizer("ButterCracker"));
                    break;
                case 3:
                    meal.setAppetizer(DishFactory.createAppetizer("CheeseTwist"));
                    break;
                case 4:
                    meal.setAppetizer(DishFactory.createAppetizer("PotatoBite"));
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nMain Course");
        System.out.println(" [05] Lasagna");
        System.out.println(" [06] Steak");
        System.out.println(" [07] Molokhiya");
        System.out.println(" [08] Grilled Chicken");
        System.out.println(" Any other key to skip");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 5:
                    meal.setMainCourse(DishFactory.createMainCourse("Lasagna"));
                    break;
                case 6:
                    meal.setMainCourse(DishFactory.createMainCourse("Steak"));
                    break;
                case 7:
                    meal.setMainCourse(DishFactory.createMainCourse("Molokhiya"));
                    break;
                case 8:
                    meal.setMainCourse(DishFactory.createMainCourse("GrilledChicken"));
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nDesserts");
        System.out.println(" [09] Fruit Salad");
        System.out.println(" [10] Tiramisu");
        System.out.println(" [11] Browny");
        System.out.println(" [12] Ice Cream");
        System.out.println(" Any other key to skip");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 9:
                    meal.setDessert(DishFactory.createDessert("FruitSalad"));
                    break;
                case 10:
                    meal.setDessert(DishFactory.createDessert("Tiramisu"));
                    break;
                case 11:
                    meal.setDessert(DishFactory.createDessert("Browny"));
                    break;
                case 12:
                    meal.setDessert(DishFactory.createDessert("IceCream"));
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nYour Meal:");
        if (meal.getAppetizer() != null) {
            meal.getAppetizer().serve();
        }
        if (meal.getMainCourse() != null) {
            meal.getMainCourse().serve();
        }
        if (meal.getDessert() != null) {
            meal.getDessert().serve();
        }

        scanner.close();
    }
}
