import java.util.List;

public class PotatoBite extends Dish implements IAppetizer{

    public PotatoBite(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Potato Bite\n"+ showDetails());
    }
}
