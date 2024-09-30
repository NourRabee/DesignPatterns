import java.util.List;

public interface IMealFactory {

    IAppetizer prepareAppetizer();
    IMainCourse prepareMainCourse();
    IDessert prepareDessert();
}


class SpecialCombo implements IMealFactory {

    @Override
    public IAppetizer prepareAppetizer() {
        return new CheeseTwist("Small", "100-150", 7.99f, List.of("Puff pastry", "Cheese", "Egg", "Salt"));
    }

    @Override
    public IMainCourse prepareMainCourse() {
        return new Lasagna("Large", "300-600", 14.99f, List.of("Pasta", "Cheese", "Tomato", "Beef"));
    }

    @Override
    public IDessert prepareDessert() {
        return new IceCream("Small", "200-250", 6.99f, List.of("Milk", "Sugar", "Cream", "Egg yolks", "Vanilla extract"));
    }
}

class DietMeal implements IMealFactory{

    @Override
    public IAppetizer prepareAppetizer() {
        return new ChickenSalad("Small", "350-450", 8.99f, List.of("Chicken", "Lettuce", "Tomatoes", "Cucumbers", "Salad dressing"));
    }

    @Override
    public IMainCourse prepareMainCourse() {
        return new Steak("Medium", "500-700", 17.99f, List.of("Beef steak", "Salt", "Pepper"));
    }

    @Override
    public IDessert prepareDessert() {
        return new FruitSalad("Medium", "100-150", 7.99f, List.of("Apple", "Banana", "Orange", "Berries"));
    }
}


