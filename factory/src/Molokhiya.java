import java.util.List;

public class Molokhiya extends Dish implements IMainCourse{

    public Molokhiya(String size, String calories, Float price, List<String> ingredients) {
        super(size, calories, price, ingredients);
    }

    @Override
    public void serve() {
        System.out.println("Molokhiya\n"+ showDetails());
    }
}
