import java.util.List;

public class Steak extends Dish implements IMainCourse{

    public Steak(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Steak\n"+ showDetails());
    }
}
