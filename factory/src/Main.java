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
                    meal.setAppetizer(new ChickenSaladFactory().CreateDish());
                    break;
                case 2:
                    meal.setAppetizer(new ButterCrackerFactory().CreateDish());
                    break;
                case 3:
                    meal.setAppetizer(new CheeseTwistFactory().CreateDish());
                    break;
                case 4:
                    meal.setAppetizer(new PotatoBiteFactory().CreateDish());
                    break;
                default:
                    break;
            }
        }else {
            scanner.next();
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
                    meal.setMainCourse(new LasagnaFactory().CreateDish());
                    break;
                case 6:
                    meal.setMainCourse(new SteakFactory().CreateDish());
                    break;
                case 7:
                    meal.setMainCourse(new MolokhiyaFactory().CreateDish());
                    break;
                case 8:
                    meal.setMainCourse(new GrilledChickenFactory().CreateDish());
                    break;
                default:
                    break;
            }
        }else {
            scanner.next();
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
                    meal.setDessert(new FruitSaladFactory().CreateDish());
                    break;
                case 10:
                    meal.setDessert(new TiramisuFactory().CreateDish());
                    break;
                case 11:
                    meal.setDessert(new BrownyFactory().CreateDish());
                    break;
                case 12:
                    meal.setDessert(new IceCreamFactory().CreateDish());
                    break;
                default:
                    break;
            }
        }else {
            scanner.next();
        }

        System.out.println("\nCombos");
        System.out.println(" [13] Special Combo");
        System.out.println(" [14] Diet Meal");

        IMealFactory mealFactory = null;

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 13:
                    mealFactory = new SpecialCombo();
                    break;
                case 14:
                    mealFactory = new DietMeal();
                    break;
                default:
                    break;
            }

            meal.setAppetizer(mealFactory != null ? mealFactory.prepareAppetizer() : null);
            meal.setMainCourse(mealFactory != null ? mealFactory.prepareMainCourse() : null);
            meal.setDessert(mealFactory != null ? mealFactory.prepareDessert() : null);

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
