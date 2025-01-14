/*


class PizzaDelivery {
  // ...
  int getRating() {

    return moreThanFiveLateDeliveries() ? 2 : 1;
  }
  boolean moreThanFiveLateDeliveries() {

    return numberOfLateDeliveries > 5;
  }
}

*/


class PizzaDelivery {
    private int numberOfLateDeliveries;

    // Getter for rating
    int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }

    // Setter for numberOfLateDeliveries (optional, for testing or future use)
    public void setNumberOfLateDeliveries(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }
}
