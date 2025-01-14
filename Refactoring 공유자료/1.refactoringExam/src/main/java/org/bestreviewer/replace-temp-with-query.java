/*



double calculateTotal() {
  double basePrice = quantity * itemPrice;
  if (basePrice > 1000) {
    return basePrice * 0.95;
  }
  else {
    return basePrice * 0.98;
  }
}


*/

double calculateTotal() {
    double basePrice = calculateBasePrice();
    double discountRate = getDiscountRate(basePrice);
    return basePrice * discountRate;
}

private double calculateBasePrice() {
    return quantity * itemPrice;
}

private double getDiscountRate(double basePrice) {
    return basePrice > 1000 ? 0.95 : 0.98;
}
