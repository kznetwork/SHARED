/*


int discount(int inputVal, int quantity) {
  if (quantity > 50) {
    inputVal -= 2;
  }
  // ...
}

*/


int discount(int inputVal, int quantity) {
    if (isEligibleForDiscount(quantity)) {
        inputVal -= calculateDiscount();
    }
    // ... (추가 로직)
    return inputVal;
}

private boolean isEligibleForDiscount(int quantity) {
    return quantity > 50;
}

private int calculateDiscount() {
    return 2; // 할인 금액
}
