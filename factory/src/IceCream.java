import java.util.List;

public class IceCream extends Dish implements IDessert {

    public IceCream(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Ice Cream\n"+ showDetails());
    }
}
