import java.util.List;

public class CheeseTwist extends Dish implements IAppetizer {

    public CheeseTwist(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Cheese Twist\n"+ showDetails());
    }
}
