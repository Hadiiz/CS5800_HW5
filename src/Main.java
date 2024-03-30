//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Cheese(new Burger()));
        order.addItem(new Salt(new Fries()));

        System.out.println(order.getOrder());
        System.out.println("Total cost before discount: " + order.getTotalCost());

        LoyalityStatus loyalty = new LoyalityStatus();
        double totalAfterDiscount = loyalty.applyDiscount(order.getTotalCost(), "Gold");
        System.out.println("Total cost after discount: " + totalAfterDiscount);
    }
}