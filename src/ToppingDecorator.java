abstract class ToppingDecorator implements FoodItem{
    protected FoodItem foodItem;
    public ToppingDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }


    @java.lang.Override
    public abstract double getCost() ;
    public abstract String getItem();
}

class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.0;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + ", Cheese";
    }
}

class Salt extends ToppingDecorator {
    public Salt(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.5;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + ", Salt";
    }
}

class Pepper extends ToppingDecorator {
    public Pepper(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.55;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + ", Pepper";
    }
}

