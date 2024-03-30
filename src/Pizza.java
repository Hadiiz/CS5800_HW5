public class Pizza implements FoodItem{

    @java.lang.Override
    public double getCost() {
        return 13.0;
    }

    @Override
    public String getItem() {
        return "Pizza";
    }
}
