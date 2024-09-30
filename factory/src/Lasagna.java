import java.util.List;

public class Lasagna extends Dish implements IMainCourse{

    public Lasagna(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Lasagna\n"+ showDetails());
    }
}
