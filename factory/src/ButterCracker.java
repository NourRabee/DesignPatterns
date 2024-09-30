import java.util.List;

public class ButterCracker extends Dish implements IAppetizer {

    public ButterCracker(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve(){

        System.out.println("Appetizers.ButterCracker\n"+ showDetails());

    }
}
