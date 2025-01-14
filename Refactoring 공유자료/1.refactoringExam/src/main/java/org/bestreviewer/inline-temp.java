/*


boolean hasDiscount(Order order) {
  double basePrice = order.basePrice();
  return basePrice > 1000;
}


*/


boolean hasDiscount(Order order) {
    return order.basePrice() > 1000;
}
