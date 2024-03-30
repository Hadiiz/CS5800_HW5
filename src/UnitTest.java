import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void testBurgerCost() {
        FoodItem burger = new Burger();
        assertEquals( "Burger cost should be 5.0", 5.0, burger.getCost(), 0.001 );

    }

    @Test
    public void testFriesCost() {
        FoodItem fries = new Fries();
        assertEquals("Fries cost should be 3.0", 3.0, fries.getCost(), 0.001);
    }

    @Test
    public void testHotDogCost() {
        FoodItem pizza = new Pizza();
        assertEquals("Pizza cost should be 13.0",13.0, pizza.getCost(), 0.001);
    }

    @Test
    public void testCheeseDecorator() {
        FoodItem cheeseBurger = new Cheese(new Burger());
        assertEquals("Cheese Burger cost should be 6.0", 6.0, cheeseBurger.getCost(), 0.001);
        assertEquals("Items should match", "Burger, Cheese", cheeseBurger.getItem() );
    }

    @Test
    public void testSaltDecorator() {
        FoodItem saltedFries = new Salt(new Fries());
        assertEquals("Salted Fries cost should be 3.5", 3.5, saltedFries.getCost() , 0.001);
        assertEquals("Description should match", "Fries, Salt", saltedFries.getItem() );
    }

    @Test
    public void testPepperDecorator() {
        FoodItem pepperedPizza = new Pepper(new Pizza());
        assertEquals("Peppered Pizza cost should be 13.55", 13.55, pepperedPizza.getCost() , 0.001);
        assertEquals("Description should match", "Pizza, Pepper", pepperedPizza.getItem() );
    }

    @Test
    public void testOrderTotalCost() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Cheese(new Fries()));
        assertEquals("Total order cost should be 9.0", 9.0, order.getTotalCost(), 0.001);
    }
    @Test
    public void testGetOrder() {
        Order order = new Order();
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();

        order.addItem(burger);
        order.addItem(fries);

        order.getOrder();

        String expectedOutput = "Your order:\n- " + burger.getItem() + "\n- " + fries.getItem() + "\n";
        assertEquals(expectedOutput, order.getOrder());
    }

    @Test
    public void testLoyaltyDiscount() {
        LoyalityStatus loyalty = new LoyalityStatus();
        double total = 10.0;
        assertEquals("Gold discount should be applied", 9.0, loyalty.applyDiscount(total, "Gold"), 0.001);
        assertEquals("Silver discount should be applied", 9.5, loyalty.applyDiscount(total, "Silver"), 0.001);
        assertEquals("No discount should be applied", 10.0, loyalty.applyDiscount(total, "None"), 0.001);
    }
}
