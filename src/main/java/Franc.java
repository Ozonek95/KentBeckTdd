public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount=amount;
        this.currency=currency;
    }

    public Money times(int multiplication) {
      return Money.franc(amount*multiplication);
    }

    public String currency() {
        return currency;
    }

}
