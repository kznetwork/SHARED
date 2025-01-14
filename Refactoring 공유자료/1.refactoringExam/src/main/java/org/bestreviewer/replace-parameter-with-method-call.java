/*


int basePrice = quantity * itemPrice;
double seasonDiscount = this.getSeasonalDiscount();
double fees = this.getFees();
double finalPrice = discountedPrice(basePrice, seasonDiscount, fees);


*/

double calculateFinalPrice(int quantity, double itemPrice) {
    int basePrice = calculateBasePrice(quantity, itemPrice);
    double seasonDiscount = getSeasonalDiscount();
    double fees = getFees();
    return calculateDiscountedPrice(basePrice, seasonDiscount, fees);
}

private int calculateBasePrice(int quantity, double itemPrice) {
    return quantity * (int) itemPrice;
}

private double calculateDiscountedPrice(int basePrice, double seasonDiscount, double fees) {
    return basePrice - (basePrice * seasonDiscount) + fees;
}
