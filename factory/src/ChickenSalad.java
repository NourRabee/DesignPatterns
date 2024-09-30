import java.util.List;

public class ChickenSalad extends Dish implements IAppetizer {

    public ChickenSalad(String size, String calories, Float price, List<String> ingredients){
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Chicken Salad \n" + showDetails());
    }
}
