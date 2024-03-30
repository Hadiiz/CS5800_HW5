public class Burger implements FoodItem{

    @Override
    public double getCost() {
        return 5.0;
    }
    @Override
    public String getItem() {
        return "Burger";
    }

}
