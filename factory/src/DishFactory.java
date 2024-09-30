import java.util.List;

public abstract class DishFactory {

    public abstract IDish CreateDish();

}

class ButterCrackerFactory extends DishFactory{
    @Override
    public IAppetizer CreateDish() {
        return new ButterCracker("Small", "70-80", 9.99f, List.of("Flour", "Butter", "Salt"));
    }
}

class CheeseTwistFactory extends DishFactory {
    @Override
    public IAppetizer CreateDish() {
        return new CheeseTwist("Small", "100-150", 7.99f, List.of("Puff pastry", "Cheese", "Egg", "Salt"));
    }
}

class ChickenSaladFactory extends DishFactory{

    // Covariant return types allow a method in a subclass to return a more specific type than the method in the superclass.
    // In other words, a subclass can override a method and return a type that is a subclass or subinterface of the return
    // type declared in the parent class.
    @Override
    public IAppetizer CreateDish() {
        return new ChickenSalad("Small", "350-450", 8.99f, List.of("Chicken", "Lettuce", "Tomatoes", "Cucumbers", "Salad dressing"));
    }
}

class FruitSaladFactory extends DishFactory {
    @Override
    public IDessert CreateDish() {
        return new FruitSalad("Medium", "100-150", 7.99f, List.of("Apple", "Banana", "Orange", "Berries"));
    }
}

class IceCreamFactory extends DishFactory {
    @Override
    public IDessert CreateDish() {
        return new IceCream("Small", "200-250", 6.99f, List.of("Milk", "Sugar", "Cream", "Egg yolks", "Vanilla extract"));    }
}

class TiramisuFactory extends DishFactory {
    @Override
    public IDessert CreateDish() {
        return new Tiramisu("Small", "400-600", 8.99f, List.of("Ladyfingers", "Coffee", "Egg yolks", "Mascarpone cheese", "Cocoa powder"));
    }
}

class BrownyFactory extends DishFactory {
    @Override
    public IDessert CreateDish() {
        return new Browny("Medium", "150-250", 7.99f, List.of("Sugar", "Butter", "Cocoa powder", "Eggs", "Flour", "Vanilla extract"));
    }
}


class GrilledChickenFactory extends DishFactory{

    @Override
    public IMainCourse CreateDish() {
        return new GrilledChicken("Large", "200-300", 15.99f, List.of("Chicken", "Salt", "Pepper", "Paprika"));
    }
}

class LasagnaFactory extends DishFactory{

    @Override
    public IMainCourse CreateDish() {
        return new Lasagna("Large", "300-600", 14.99f, List.of("Pasta", "Cheese", "Tomato", "Beef"));
    }
}

class MolokhiyaFactory extends DishFactory{

    @Override
    public IMainCourse CreateDish() {
        return new Molokhiya("Medium", "100-200", 16.99f, List.of("Molokhiya leaves", "Chicken broth", "Garlic", "Coriander"));
    }
}

class PotatoBiteFactory extends DishFactory{
    @Override
    public IAppetizer CreateDish() {
        return new PotatoBite("Small", "200-250", 5.99f, List.of("Potato", "Cheese", "Breadcrumbs", "Egg"));
    }
}

class SteakFactory extends DishFactory{

    @Override
    public IMainCourse CreateDish() {
        return new Steak("Medium", "500-700", 17.99f, List.of("Beef steak", "Salt", "Pepper"));
    }
}













