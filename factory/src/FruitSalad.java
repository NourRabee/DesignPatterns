import java.util.List;

public class FruitSalad extends Dish implements IDessert {

    public FruitSalad(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }


    @Override
    public void serve() {
        System.out.println("Fruit Salad\n"+ showDetails());
    }
}
