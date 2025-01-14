/*


class Order {
  // ...
  public double price() {
    double primaryBasePrice;
    double secondaryBasePrice;
    double tertiaryBasePrice;
    // Perform long computation.
  }
}

*/


class Order {
    // ... Other fields and methods

    public double price() {
        double primaryBasePrice = calculatePrimaryBasePrice();
        double secondaryBasePrice = calculateSecondaryBasePrice();
        double tertiaryBasePrice = calculateTertiaryBasePrice();
        return primaryBasePrice + secondaryBasePrice + tertiaryBasePrice;
    }

    private double calculatePrimaryBasePrice() {
        // Logic for calculating primary base price
        return 100.0; // Example value
    }

    private double calculateSecondaryBasePrice() {
        // Logic for calculating secondary base price
        return 50.0; // Example value
    }

    private double calculateTertiaryBasePrice() {
        // Logic for calculating tertiary base price
        return 30.0; // Example value
    }
}
