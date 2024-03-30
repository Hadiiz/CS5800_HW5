import java.util.ArrayList;
import java.util.List;

class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (FoodItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public String getOrder(){
        StringBuilder result = new StringBuilder("Your order:");
        for (FoodItem item : items){
            result.append("\n- ").append(item.getItem());
        }
        return result.toString();
    }
}
