# 현재 기능 설명
  - 비디오 가게에서 고객의 요금 내역을 계산하고 인쇄하는 기능을 제공
  - 프로그램은 고객이 어떤 영화를 대여 했는지와 대여 기간을 알려주는 기능을 제공
  - 대여 기간에 따라 요금을 계산
  - 영화 유형을 식별
      - 일반(reqular), 어린이(child), 신작(new releases) 세 가지 종류
  - 명세서에는 요금 계산 외에도 영화가 새 개봉작인지 여부에 따라 달라지는 대여포인트도 계산됩니다.


# 요구 사항
- 대여 요금 및 빈번한 대여 포인트를 변경하기 위해 영화 유형을 추가하려고 합니다.("bestseller") 
  처음 2일 동안은 하루 5달러, 그 이후에는 하루 7.5달러가 청구되는 "bestseller"가 필요합니다.
  bestseller 종류는 비싸므로 하루에 5포인트씩 보상이 주어집니다.

- 특정 정책에 따라 영화 유형을 변경하고 싶습니다. 예를 들어 영화가 인기를 얻으면 "new releases"에서 "bestseller"가 될 수 있습니다.
  아직까지 정책이 결정되지는 않았지만 가능성을 고려해 볼 필요가 있다.

- 웹에서 비즈니스를 확장할 계획이 있습니다. 고객 명세서를 종이에 인쇄하는 것뿐만 아니라 HTML 형식으로도 인쇄합니다.


 
 ```java

    public String htmlStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "<table><tr><th colspan=3 align=left><b>Rentals for <b></th><th><em>" + getName() + "</em></th></tr>\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    frequentRenterPoints++;
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    frequentRenterPoints++;
                    if (each.getDaysRented() > 0)
                        thisAmount += each.getDaysRented() * 3;
                    else
                        thisAmount += 2;
                    break;
                case Movie.CHILDREN:
                    frequentRenterPoints++;
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1) frequentRenterPoints++;

            //To-Do : Best Seller
            if ((each.getMovie().getPriceCode() == Movie.BEST_SELLER){
                //To-Do : compute thisAmount, frequentRenterPointer
            }

            //show figures for this rental
            result += "<tr><td>&nbsp;</td><td>"+ each.getMovie().getTitle() + "</td><td>&nbsp;</td><td>" +
                    String.valueOf(thisAmount) + "</td></tr>\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "<tr><td colspan=4><b>Amount owed is <EM>" + String.valueOf(totalAmount) + "</b></td></tr>\n";
        result += "<tr><td colspan=4><b>You earned <EM>" +
                String.valueOf(frequentRenterPoints) +
                "</EM> frequent " + "renter points</b></td></tr></table>";
        return result;
    }
 
 ```
 
