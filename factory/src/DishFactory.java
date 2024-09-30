import java.util.List;

public class DishFactory {

    public static IAppetizer createAppetizer (String appetizerType){
            switch (appetizerType) {
                case "ChickenSalad":
                    return new ChickenSalad("Small", "350-450", 8.99f, List.of("Chicken", "Lettuce", "Tomatoes", "Cucumbers", "Salad dressing"));
                case "ButterCracker":
                    return new ButterCracker("Small", "70-80", 9.99f, List.of("Flour", "Butter", "Salt"));
                case "CheeseTwist":
                    return new CheeseTwist("Small", "100-150", 7.99f,List.of("Puff pastry", "Cheese", "Egg", "Salt"));
                case "PotatoBite":
                    return new PotatoBite("Small", "200-250", 5.99f, List.of("Potato", "Cheese", "Breadcrumbs", "Egg"));
                default:
                    throw new IllegalArgumentException("Invalid dish type: " + appetizerType);
            }
        }

    public static IMainCourse createMainCourse(String mainCourseType) {
        switch (mainCourseType) {
            case "Lasagna":
                return new Lasagna("Large", "300-600", 14.99f, List.of("Pasta", "Cheese", "Tomato", "Beef"));
            case "Steak":
                return new Steak("Medium", "500-700", 17.99f, List.of("Beef steak", "Salt", "Pepper"));
            case "Molokhiya":
                return new Molokhiya("Medium", "100-200", 16.99f, List.of("Molokhiya leaves", "Chicken broth", "Garlic", "Coriander"));
            case "GrilledChicken":
                return new GrilledChicken("Large", "200-300", 15.99f, List.of("Chicken", "Salt", "Pepper", "Paprika"));
            default:
                throw new IllegalArgumentException("Dish type not supported: " + mainCourseType);
        }
    }

    public static IDessert createDessert(String dessertType) {
        switch (dessertType) {
            case "FruitSalad":
                return new FruitSalad("Medium", "100-150", 7.99f, List.of("Apple", "Banana", "Orange", "Berries"));
            case "Tiramisu":
                return new Tiramisu("Small", "400-600", 8.99f, List.of("Ladyfingers", "Coffee", "Egg yolks", "Mascarpone cheese", "Cocoa powder"));
            case "Browny":
                return new Browny("Medium", "150-250", 7.99f, List.of("Sugar", "Butter", "Cocoa powder", "Eggs", "Flour", "Vanilla extract"));
            case "IceCream":
                return new IceCream("Small", "200-250", 6.99f,List.of("Milk", "Sugar", "Cream", "Egg yolks", "Vanilla extract"));
            default:
                throw new IllegalArgumentException("Invalid dish type: " + dessertType);
        }
    }
}