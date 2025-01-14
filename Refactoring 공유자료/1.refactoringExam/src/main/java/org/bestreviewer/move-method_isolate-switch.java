/*


class Order {
  // ...

  public double calculateTotal() {
    double total = 0;
    for (Product product : getProducts()) {
      total += product.quantity * product.price;
    }
    total = applyRegionalDiscounts(total);
    return total;
  }

  public double applyRegionalDiscounts(double total) {
    double result = total;
    switch (user.getCountry()) {
      case "US": result *= 0.85; break;
      case "RU": result *= 0.75; break;
      case "CN": result *= 0.9; break;
      // ...
    }
    return result;
  }

  */


class Order {
    private User user;
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = calculateProductTotal();
        return applyRegionalDiscount(total, user.getCountry());
    }

    private double calculateProductTotal() {
        return products.stream()
                .mapToDouble(product -> product.quantity * product.price)
                .sum();
    }

    private double applyRegionalDiscount(double total, String country) {
        double discountRate = getDiscountRateByCountry(country);
        return total * discountRate;
    }

    private double getDiscountRateByCountry(String country) {
        return switch (country) {
            case "US" -> 0.85;
            case "RU" -> 0.75;
            case "CN" -> 0.9;
            default -> 1.0; // No discount for other countries
        };
    }
}
