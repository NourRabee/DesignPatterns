import java.util.List;

public class Browny extends Dish implements IDessert{

    public Browny(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Browny\n"+ showDetails());
    }
}
