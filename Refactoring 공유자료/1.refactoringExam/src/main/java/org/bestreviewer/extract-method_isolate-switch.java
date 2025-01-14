/*

class Order {
  // ...

  public double calculateTotal() {
    double total = 0;
    for (Product product : getProducts()) {
      total += product.quantity * product.price;
    }

    // Apply regional discounts.
    switch (user.getCountry()) {
      case "US": total *= 0.85; break;
      case "RU": total *= 0.75; break;
      case "CN": total *= 0.9; break;
      // ...
    }

    return total;
  }

  */


class Order {
    private User user; // User 정보 포함
    private List<Product> products; // Product 리스트 포함

    // Getter for products
    public List<Product> getProducts() {
        return products;
    }

    // Total 계산 메서드
    public double calculateTotal() {
        double total = calculateProductTotal();
        return applyRegionalDiscount(total, user.getCountry());
    }

    // 제품별 총합 계산
    private double calculateProductTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.quantity * product.price;
        }
        return total;
    }

    // 지역별 할인 적용
    private double applyRegionalDiscount(double total, String country) {
        double discountRate = getDiscountRate(country);
        return total * discountRate;
    }

    // 지역별 할인율 반환
    private double getDiscountRate(String country) {
        switch (country) {
            case "US": return 0.85;
            case "RU": return 0.75;
            case "CN": return 0.9;
            default: return 1.0; // 기본 할인 없음
        }
    }
}
