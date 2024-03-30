class LoyalityStatus {
    public double applyDiscount(double total, String status) {
        switch (status) {
            case "Gold":
                return total * 0.9; // 10% discount
            case "Silver":
                return total * 0.95; // 5% discount
            default:
                return total; // no discount
        }
    }
}