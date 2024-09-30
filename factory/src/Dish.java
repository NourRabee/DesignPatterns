import java.util.List;

public abstract class Dish{

    public String size;
    public String  calories;
    public Float price;
    public List<String> ingredients;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Dish(String size, String calories, Float price, List<String> ingredients) {
        this.size = size;
        this.calories = calories;
        this.price = price;
        this.ingredients = ingredients;
    }

    protected String showDetails(){

        return String.format(
                "Size: %s (%s) cal. ($%.2f)\nIngredients: %s\n",
                size, calories, price, String.join(", ", ingredients)
        );


    }
}
