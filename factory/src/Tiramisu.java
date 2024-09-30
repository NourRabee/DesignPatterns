import java.util.List;

public class Tiramisu extends Dish implements IDessert{

    public Tiramisu(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }


    @Override
    public void serve() {
        System.out.println("Tiramisu\n"+ showDetails());
    }
}
