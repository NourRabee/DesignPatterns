import java.util.List;

public class GrilledChicken extends Dish implements IMainCourse{

    public GrilledChicken(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Grilled Chicken\n"+ showDetails());
    }
}
